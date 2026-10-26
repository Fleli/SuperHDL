package s3_ir.GraphIR.GraphNative;

import s3_ir.GraphIR.Core.GraphComponent;
import s3_ir.GraphIR.Ports.AbstractGraphPortOwner;
import s3_ir.Optimizations.Optimizable;

// choices here are somewhat arbitrary since theoretically everything can just be lowered to purely NAND gates immediately
// but keeping higher level items is beneficial for performance and analysis purposes
// instead just lower everything later (in the emitter) since the lowering may also depend
// on the target (e.g. PCB versus FPGA; latter may want to retain e.g. latches)

public abstract class GraphNative extends AbstractGraphPortOwner
        implements Optimizable, GraphComponent {
    
}
