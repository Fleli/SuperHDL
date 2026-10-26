package s2_elab;

import java.util.List;

import s1_parse.SHDLProgram;
import s2_elab.Core.ElabError;
import s2_elab.Core.ElabStage;
import s2_elab.Core.ElabStrictness;
import s2_elab.Stages.CompileTimeExpressionsResolver;
import s2_elab.Stages.CompileTimeStatementsExecutor;
import s2_elab.Stages.ModuleReferencesResolver;
import s2_elab.Stages.OperatorDesugarer;

public class Elaborator {
    
    private ElabStrictness strictness;
    private SHDLProgram underlyingShdlProgram;
    
    private ElabStage[] elaborationPipeline;
    
    private int executionStage = 0;
    
    public Elaborator(ElabStrictness strictness, SHDLProgram underlShdlProgram) {
        
        this.strictness = strictness;
        this.underlyingShdlProgram = underlShdlProgram;
        
        this.elaborationPipeline = new ElabStage[] {
            new CompileTimeExpressionsResolver(this),
            new ModuleReferencesResolver(this),
            new CompileTimeStatementsExecutor(this),
            new OperatorDesugarer(this)
        };
        
    }
    
    public int getExecutionStage() {
        return executionStage;
    }
    
    public List<ElabError> executeNextStep() {
        
        // change to compiler-internal exception which acn then be caught outside in a wrappeR?
        if (this.executionStage >= this.elaborationPipeline.length) {
            throw new IllegalStateException("Attempted execution beyond pipeline length.");
        }
        
        List<ElabError> result = elaborationPipeline[this.executionStage]
            .executeElabStage(this.strictness)
        ;
        this.executionStage += 1;
        
        return result;
        
    }
    
    public SHDLProgram getUnderlyingShdlProgram() {
        return underlyingShdlProgram;
    }
    
}
