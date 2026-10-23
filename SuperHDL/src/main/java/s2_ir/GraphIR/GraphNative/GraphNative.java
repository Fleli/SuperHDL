package s2_ir.GraphIR.GraphNative;

import s2_ir.Optimizations.OptimizationResult;
import s2_ir.Optimizations.Optimizer;
import s2_ir.Optimizations.Optimizable;

// choices here are somewhat arbitrary since theoretically everything can just be lowered to purely NAND gates immediately
// but keeping higher level items is beneficial for performance and analysis purposes
// instead just lower everything later (in the emitter) since the lowering may also depend
// on the target (e.g. PCB versus FPGA; latter may want to retain e.g. latches)

public abstract class GraphNative implements Optimizable {
    
    @Override
    public OptimizationResult run_optimization(Optimizer optimizer) {
        throw new IllegalStateException("Not implemented");
    }
    
}
