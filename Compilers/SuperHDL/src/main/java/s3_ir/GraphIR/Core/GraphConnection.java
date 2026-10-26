package s3_ir.GraphIR.Core;

import s3_ir.GraphIR.Ports.GraphInputPort;
import s3_ir.GraphIR.Ports.GraphOutputPort;

public record GraphConnection(
        GraphOutputPort source,
        GraphInputPort destination
) {
    
}
