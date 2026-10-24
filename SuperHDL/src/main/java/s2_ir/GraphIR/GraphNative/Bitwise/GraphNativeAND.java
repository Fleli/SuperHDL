package s2_ir.GraphIR.GraphNative.Bitwise;

import s2_ir.GraphIR.GraphNative.GraphNative;
import s2_ir.Optimizations.OptimizationResult;
import s2_ir.Optimizations.Optimizer;

public class GraphNativeAND extends GraphNativeBitwise {
    
    public GraphNativeAND(int bitWidth, int inputArity,
                          GraphNative[] operandNodes, GraphNative outputNode) {
        super(bitWidth, inputArity, operandNodes, outputNode);
    }
    
    @Override
    public OptimizationResult run_optimization(Optimizer optimizer) {
        
        if ( this.getInputArity() == 1 ) {
            throw new IllegalStateException("Not implemented yet");
        }
        
        return null;
        
    }
    
}
