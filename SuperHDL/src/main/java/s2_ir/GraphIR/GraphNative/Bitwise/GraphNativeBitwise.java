package s2_ir.GraphIR.GraphNative.Bitwise;

import s2_ir.GraphIR.GraphNative.GraphNative;

public abstract class GraphNativeBitwise extends GraphNative {
    
    private final int bitWidth;
    private final int inputArity;
    
    private final GraphNative[] operandNodes;
    private final GraphNative outputNode;

    protected GraphNativeBitwise(int bitWidth, int inputArity,
                                 GraphNative[] operandNodes, GraphNative outputNode) {
        this.bitWidth = bitWidth;
        this.inputArity = inputArity;
        this.operandNodes = operandNodes;
        this.outputNode = outputNode;
    }
    
    public int getBitWidth() {
        return bitWidth;
    }
    
    public int getInputArity() {
        return inputArity;
    }

    public GraphNative[] getOperandNodes() {
        return operandNodes;
    }

    public GraphNative getOutputNode() {
        return outputNode;
    }
    
}
