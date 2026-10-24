package s2_ir.GraphIR.Core;

import s2_ir.GraphIR.Ports.GraphInputPort;
import s2_ir.GraphIR.Ports.GraphOutputPort;

public record GraphConnection(
        GraphOutputPort source,
        GraphInputPort destination
) {
    
}
