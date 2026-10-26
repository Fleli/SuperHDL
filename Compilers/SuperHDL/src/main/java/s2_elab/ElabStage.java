package s2_elab;

import java.util.List;

@FunctionalInterface 
public interface ElabStage {
    
    public List<ElabError> executeElabStage(ElabStrictness strictness);
    
}
