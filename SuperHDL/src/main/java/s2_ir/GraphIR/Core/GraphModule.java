package s2_ir.GraphIR.Core;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import s2_ir.GraphIR.Ports.AbstractGraphPortOwner;
import s2_ir.GraphIR.Ports.GraphInputPort;
import s2_ir.GraphIR.Ports.GraphOutputPort;
import s2_ir.Optimizations.OptimizationResult;
import s2_ir.Optimizations.Optimizer;
import s2_ir.Optimizations.Optimizable;

public class GraphModule extends AbstractGraphPortOwner implements Optimizable {
    
    private final Set<GraphComponent> components = new LinkedHashSet<>();
    private final Set<GraphConnection> connections = new LinkedHashSet<>();
    
    public void addComponent(GraphComponent component) {
        components.add(component);
    }
    
    public Set<GraphComponent> getComponents() {
        return Collections.unmodifiableSet(new LinkedHashSet<>(components));
    }
    
    public Set<GraphConnection> getConnections() {
        return Collections.unmodifiableSet(new LinkedHashSet<>(connections));
    }
    
    public void connect(GraphOutputPort source, GraphInputPort destination) {
        
        boolean sourceBelongsToModule = source.getOwner() == this
                || components.contains(source.getOwner());
        boolean destinationBelongsToModule = destination.getOwner() == this
                || components.contains(destination.getOwner());
        
        if (!sourceBelongsToModule || !destinationBelongsToModule) {
            throw new IllegalArgumentException("Both ports must belong to this module.");
        }
        
        if (source.getBitWidth() != destination.getBitWidth()) {
            throw new IllegalArgumentException("Connected ports must have the same bit width.");
        }
        
        connections.add(new GraphConnection(source, destination));
        
    }
    
    // TODO: Define how multiple drivers and tri-state buses are represented.
    
    @Override
    public OptimizationResult run_optimization(Optimizer optimizer) {
        throw new IllegalStateException("Not implemented");
    }
    
}
