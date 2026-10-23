package s2_ir.GraphIR.Core;

import java.util.List;

public class GraphModuleDiff {
    
    private List<GraphComponentDiff> componentDiffs;
    
    public List<String> getDiffDescriptions() {
        return componentDiffs.stream().map( 
                diff -> diff.getDescription() 
            ).toList();
    }
    
}
