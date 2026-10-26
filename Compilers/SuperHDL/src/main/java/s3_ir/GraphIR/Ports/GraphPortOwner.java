package s3_ir.GraphIR.Ports;

import java.util.List;

public interface GraphPortOwner {
    
    List<GraphInputPort> getInputPorts();
    
    List<GraphOutputPort> getOutputPorts();
    
}
