package s2_ir.GraphIR.GraphNative.Bitwise;

import s2_ir.GraphIR.GraphNative.GraphNative;

public abstract class GraphNativeBitwise extends GraphNative {
    
    private final int bitWidth;
    private final int inputArity;
    
    protected GraphNativeBitwise(int bitWidth, int inputArity) {
        this.bitWidth = bitWidth;
        this.inputArity = inputArity;
    }
    
    public int getBitWidth() {
        return bitWidth;
    }
    
    public int getInputArity() {
        return inputArity;
    }
    
}
