
find it somewhat difficult to reason about how to generalize language well enough, thus try and design a grammar now already -> may get a better idea

@main Chip
Chip -> Module
Module -> module { ModuleBody }
ModuleBody -> ModuleBodyStmt*

AlwaysStmt -> always { HardwareStmt* }
WhenStmt -> when EdgeCondition { HardwareStmt* }
HardwareStmt -> 

EdgeCondition -> Edge Expression
Edge -> rise
Edge -> fall
