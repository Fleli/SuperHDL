
compiler architecture

frontend -> ir -> emitter

optimization in ir stage; need high-level understand (e.g. wider purpose of circuit -> find non-obvious simplificatoins) + low-level truth tables -> simplify with easier circuits + tracing values / variables -> recursively remove redundancies 

seems like a directed graph is most natural starting point
then build reasoning engine on this graph

