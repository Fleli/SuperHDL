package s2_ir.GraphIR.Core;

import java.util.ArrayList;
import java.util.List;

import s2_ir.GraphIR.Ports.GraphInputPort;
import s2_ir.GraphIR.Ports.GraphOutputPort;
import s2_ir.GraphIR.Ports.GraphPortOwner;
import s2_ir.Optimizations.OptimizationResult;
import s2_ir.Optimizations.Optimizer;
import s2_ir.Optimizations.Optimizable;

public class GraphModule implements Optimizable, GraphPortOwner {
    
    private final List<GraphInputPort> inputPorts = new ArrayList<>();
    private final List<GraphOutputPort> outputPorts = new ArrayList<>();
    
    protected GraphInputPort declareInputPort(String name, int bitWidth) {
        
        GraphInputPort port = new GraphInputPort(this, name, bitWidth);
        inputPorts.add(port);
        return port;
        
    }
    
    protected GraphOutputPort declareOutputPort(String name, int bitWidth) {
        
        GraphOutputPort port = new GraphOutputPort(this, name, bitWidth);
        outputPorts.add(port);
        return port;
        
    }
    
    @Override
    public List<GraphInputPort> getInputPorts() {
        return List.copyOf(inputPorts);
    }
    
    @Override
    public List<GraphOutputPort> getOutputPorts() {
        return List.copyOf(outputPorts);
    }
    
    // TODO: Define how multiple drivers and tri-state buses are represented.
    
    @Override
    public OptimizationResult run_optimization(Optimizer optimizer) {
        throw new IllegalStateException("Not implemented");
    }
    
}
