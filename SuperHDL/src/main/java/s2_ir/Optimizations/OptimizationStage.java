package s2_ir.Optimizations;

import s2_ir.GraphIR.Core.GraphModule;

public interface OptimizationStage {
    
    public OptimizationResult run_optimization(GraphModule top_module, OptimizationSpec spec);
    
}
