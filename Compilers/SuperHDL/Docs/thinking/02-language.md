
probably quite small language core
some basic bitwise operators (and/or/..., +/-, )

Not very familiar with verilog's syntax, but seen examples such as

```
module and_gate (
    input wire a,
    input wire b,
    output wire y
);

    assign y = a & b;

endmodule
```

(this is kind of similar to function definition really:
```
def x( inputs... ) -> outputs... { body };
```
)

Like the module split and its composability, but would be interesting to have syntax more similar to programming languages, either in terms of defining "functions calling each other" or maybe classes composing each other -> basically describing the graph directly; means IR translation becomes fairly straightforward. Could make sense; find splitting a circuit into conceptual modules, each with sub-modules etc. plus some interfaces quite a natural way to think about it.

probably fairly similar to verilog conceptually, but investigate before final decisions

actually go with similar "function-like" def here as well?

```
module CPU {
    
    Register[8] registers;
    ALU alu;
    
};

module Register {
    
    interface {
        input clk;
        input reset;
        input [7:0] d;
        output [7:0] q;
    }
    
    when rise(clk) {
        if (reset) q = 0;
        else q = d;
    }
    
}
```

also looks like verilog makes distinction between `=` and `<=` for assignments; blocking (update immediately) vs. non-blocking assign.

could be interesting: lists are first-class citizens and multi-wires aren't treated specially:
instead of `input [7:0] d;` and `Register[8] registers;` being different and having different syntax, we could have `input[7:0] d;` and `Register[7:0] registers;`, so the `[7:0]` means we have 8 in each case, and they're indexed in a particular order. Just means we also need some kind of interconnect operator maybe, so that e.g. the input for `d` (which makes up the interface of an actual register) can be cleanly connected to the input source (e.g. bus). And also maybe then have `wire` or something as the only built-in real component (beyond transistors/gating) in the language. Everything else is built on top of each other?

-> introduce `wiring` module-level statement? question is whether we need expicit wiring logic or whether it can be fully inferred from other statements that describe behavior -> might be more puritan and actually the "correct" abstraction?

e.g. instead of
```
module CPU {
    Register[7:0] registers;
    wire[7:0] bus;
    ALU alu;
    
    wiring {
        for each register in registers {
            wire register.d = bus;
        }
    }
};
```

consider
```
module CPU {
    Register[7:0] registers;
    wire[2:0] register_select;
    wire[7:0] bus;
    ALU alu;
    
    when rise(clk) {
        for (int i = 0; i < 7; i++) {
            if value(register_select) == i {
                registers[i].d = bus;
            }
        }
    }
};
```

something else: generic typing is probably quite useful. logic for registers is identical whether they're 4-bit or 8-bit, so no reason to redefine. better would be

```
module CPU {
    Register(S=15:0)[7:0] registers;  # 8 registers, each of 16 bits
    wire[15:0] bus;                 # A single bus of 16 bits width
    ALU alu;                        # A single ALU; no parameterization
};
module Register(range S) {          # would also imply range is built-in
    interface {
        input clk;
        input[S] d;                 # Use of parameter
        output[S] q;                # Use of parameter
    }
}
```

i also realize there may be nothing conceptually different between an input and an output in terms of language design; why can't both just be wires?
- clear in/out sep. might make analysis easier:
    - we can make a clearly directed graph of blocks (though not necessarily DAG)
    - we can check correctness; do we assign something to an input?
- however
    - a CPU bus is really neither an input nor an output (or maybe both)
    - in a register, d and q may be referred to just as wires and then we define their interface (direct interconnect through `=` to other components)
- however again
    - this view may be due to mixing behavior/intent spec with physical wiring spec
    - if we choose the former (more abstract), then inputs/outputs make more sense
    - if we just let this be a "circuit design tool", then there's really nothing special about them
    - does the distinction come down to choice of abstraction?
