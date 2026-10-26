package s3_ir.Optimizations;

import s3_ir.GraphIR.Diffs.GraphModuleDiff;

public abstract class OptimizationResult {
    
    private GraphModuleDiff diff;
    
    public GraphModuleDiff getDiff() {
        return diff;
    }
    
}
