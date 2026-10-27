package s2_elab.Objects;

public class ElabModuleTest {
    
    public static void main(String[] args) {
        ElabModule module = new ElabModule();
        
        module.addSubmodule(new ElabModule());
        module.addAlwaysStatement(new ElabAlways());
        module.addWhenStatement(new ElabWhen());
        
    }
    
}
