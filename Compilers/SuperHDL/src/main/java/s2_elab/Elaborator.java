package s2_elab;

import java.util.List;

import s1_parse.SHDLProgram;

public class Elaborator {
    
    private ElabStrictness strictness;
    private SHDLProgram underlyingShdlProgram;
    
    private ElabStage[] elaborationPipeline;
    
    private int executionStage = 0;
    
    public Elaborator(ElabStrictness strictness, SHDLProgram underlShdlProgram) {
        
        this.strictness = strictness;
        this.underlyingShdlProgram = underlShdlProgram;
        
        this.elaborationPipeline = new ElabStage[] {
            this::resolveCompileTimeExpressions,
            this::resolveModuleReferences,
            this::executeCompileTimeStatements,
            this::desugarOperators
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
    
    private List<ElabError> resolveCompileTimeExpressions(ElabStrictness strictness) {
        return List.of();
    }
    
    private List<ElabError> resolveModuleReferences(ElabStrictness strictness) {
        return List.of();
    }
    
    private List<ElabError> executeCompileTimeStatements(ElabStrictness strictness) {
        return List.of();
    }
    
    private List<ElabError> desugarOperators(ElabStrictness strictness) {
        return List.of();
    }
    
    
    
    public SHDLProgram getUnderlyingShdlProgram() {
        return underlyingShdlProgram;
    }
    
}
