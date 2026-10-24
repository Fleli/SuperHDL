package s2_ir.GraphIR.GraphNative.Bitwise;

import s2_ir.Optimizations.OptimizationResult;
import s2_ir.Optimizations.Optimizer;

public class GraphNativeAND extends GraphNativeBitwise {
    
    public GraphNativeAND(int bitWidth, int inputArity) {
        super(bitWidth, inputArity);
    }
    
    @Override
    public OptimizationResult run_optimization(Optimizer optimizer) {
        
        if ( this.getInputArity() == 1 ) {
            throw new IllegalStateException("Not implemented yet");
        }
        
        return null;
        
    }
    
}
