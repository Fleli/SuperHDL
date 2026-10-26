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
            this::resolveModules,
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
    
    private List<ElabError> resolveModules(ElabStrictness strictness) {
        return List.of();
    }
    
    public SHDLProgram getUnderlyingShdlProgram() {
        return underlyingShdlProgram;
    }
    
}
