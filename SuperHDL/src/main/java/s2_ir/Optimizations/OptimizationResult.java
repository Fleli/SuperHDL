package s2_ir.Optimizations;

import s2_ir.GraphIR.Core.GraphModuleDiff;

public abstract class OptimizationResult {
    
    private GraphModuleDiff diff;
    
    public GraphModuleDiff getDiff() {
        return diff;
    }
    
}
