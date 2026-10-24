package s2_ir.GraphIR.GraphNative;

import java.util.ArrayList;
import java.util.List;

import s2_ir.Optimizations.Optimizable;

// choices here are somewhat arbitrary since theoretically everything can just be lowered to purely NAND gates immediately
// but keeping higher level items is beneficial for performance and analysis purposes
// instead just lower everything later (in the emitter) since the lowering may also depend
// on the target (e.g. PCB versus FPGA; latter may want to retain e.g. latches)

public abstract class GraphNative implements Optimizable {
    
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
    
    public List<GraphInputPort> getInputPorts() {
        return List.copyOf(inputPorts);
    }
    
    public List<GraphOutputPort> getOutputPorts() {
        return List.copyOf(outputPorts);
    }
    
}
