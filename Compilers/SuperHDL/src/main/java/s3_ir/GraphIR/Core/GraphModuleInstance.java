package s3_ir.GraphIR.Core;

import s3_ir.GraphIR.Ports.AbstractGraphPortOwner;
import s3_ir.GraphIR.Ports.GraphInputPort;
import s3_ir.GraphIR.Ports.GraphOutputPort;

public final class GraphModuleInstance extends AbstractGraphPortOwner implements GraphComponent {
    
    private final GraphModule definition;
    
    public GraphModuleInstance(GraphModule definition) {
        
        this.definition = definition;
        
        for (GraphInputPort inputPort : definition.getInputPorts()) {
            declareInputPort(inputPort.getName(), inputPort.getBitWidth());
        }
        
        for (GraphOutputPort outputPort : definition.getOutputPorts()) {
            declareOutputPort(outputPort.getName(), outputPort.getBitWidth());
        }
        
    }
    
    public GraphModule getDefinition() {
        return definition;
    }
    
}
