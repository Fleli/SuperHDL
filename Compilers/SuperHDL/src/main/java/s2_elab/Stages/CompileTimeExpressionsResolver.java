package s2_elab.Stages;

import java.util.List;

import s2_elab.Elaborator;
import s2_elab.Core.ElabError;
import s2_elab.Core.ElabStage;
import s2_elab.Core.ElabStrictness;

public class CompileTimeExpressionsResolver extends ElabStage {
    
    public CompileTimeExpressionsResolver(Elaborator elaborator) {
        super(elaborator);
    }
    
    @Override
    public List<ElabError> executeElabStage(ElabStrictness strictness) {
        return List.of();
    }
    
}
