package s2_elab.Statements;

import s2_elab.Elaborator;

public abstract class ElabCTStmt extends ElabBodyStatement {
    
    public ElabCTStmt(Elaborator elaborator) {
        super(elaborator);
        //TODO Auto-generated constructor stub
    }

    public void compileTimeExecute() {
        throw new IllegalStateException();
    }
    
}
