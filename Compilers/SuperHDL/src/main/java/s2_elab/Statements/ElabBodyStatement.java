package s2_elab.Statements;

import s2_elab.Elaborator;

public abstract class ElabBodyStatement {
    
    private Elaborator elaborator;
    
    public ElabBodyStatement(Elaborator elaborator) {
        this.elaborator = elaborator;
    }
    
    public Elaborator getElaborator() {
        return elaborator;
    }
    
}
