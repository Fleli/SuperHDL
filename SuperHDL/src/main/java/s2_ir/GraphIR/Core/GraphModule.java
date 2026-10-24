package s2_ir.GraphIR.Core;

import s2_ir.GraphIR.Ports.AbstractGraphPortOwner;
import s2_ir.Optimizations.OptimizationResult;
import s2_ir.Optimizations.Optimizer;
import s2_ir.Optimizations.Optimizable;

public class GraphModule extends AbstractGraphPortOwner implements Optimizable {
    
    // TODO: Define how multiple drivers and tri-state buses are represented.
    
    @Override
    public OptimizationResult run_optimization(Optimizer optimizer) {
        throw new IllegalStateException("Not implemented");
    }
    
}
