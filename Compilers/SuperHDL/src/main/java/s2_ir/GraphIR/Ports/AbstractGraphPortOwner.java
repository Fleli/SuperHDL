package s2_ir.GraphIR.Ports;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGraphPortOwner implements GraphPortOwner {
    
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
    
    @Override
    public List<GraphInputPort> getInputPorts() {
        return List.copyOf(inputPorts);
    }
    
    @Override
    public List<GraphOutputPort> getOutputPorts() {
        return List.copyOf(outputPorts);
    }
    
}
