package s2_elab.Core;

import java.util.List;

import s2_elab.Elaborator;

public abstract class ElabStage {
    
    protected final Elaborator elaborator;
    
    public ElabStage(Elaborator elaborator) {
        this.elaborator = elaborator;
    }
    
    public abstract List<ElabError> executeElabStage(ElabStrictness strictness);
    
}
