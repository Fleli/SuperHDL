package s2_elab.Objects;

import java.util.HashSet;
import java.util.Set;

public class ElabModule {
    
    private Set<ElabModule> submodules;
    
    private Set<ElabAlways> alwaysStatements;
    
    private Set<ElabWhen> whenStatements;
    
    public ElabModule() {
        this.submodules = new HashSet<>();
        this.alwaysStatements = new HashSet<>();
        this.whenStatements = new HashSet<>();
        
    }
    
    public void addSubmodule(ElabModule submodule) {
        this.submodules.add(submodule);
    }
    
    public void addAlwaysStatement(ElabAlways alwaysStatement) {
        this.alwaysStatements.add(alwaysStatement);
    }
    
    public void addWhenStatement(ElabWhen whenStatement) {
        this.whenStatements.add(whenStatement);
    }
}
