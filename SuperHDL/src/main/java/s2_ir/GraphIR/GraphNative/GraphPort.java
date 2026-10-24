package s2_ir.GraphIR.GraphNative;

public abstract class GraphPort {

    private final GraphNative owner;
    private final String name;
    private final int bitWidth;

    protected GraphPort(GraphNative owner, String name, int bitWidth) {
        this.owner = owner;
        this.name = name;
        this.bitWidth = bitWidth;
    }

    public GraphNative getOwner() {
        return owner;
    }

    public String getName() {
        return name;
    }

    public int getBitWidth() {
        return bitWidth;
    }
}
