package s3_ir.GraphIR.Ports;

public abstract class GraphPort {
    
    private final GraphPortOwner owner;
    private final String name;
    private final int bitWidth;
    
    protected GraphPort(GraphPortOwner owner, String name, int bitWidth) {
        
        this.owner = owner;
        this.name = name;
        this.bitWidth = bitWidth;
        
    }
    
    public GraphPortOwner getOwner() {
        
        return owner;
        
    }
    
    public String getName() {
        
        return name;
        
    }
    
    public int getBitWidth() {
        
        return bitWidth;
        
    }
    
}
