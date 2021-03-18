package nodes;

import java.util.List;

public class BlockNode extends Node{


    private int firstLine;
    private int lastLine;

    public BlockNode(List<Node> children, String name, int firstLine, int lastLine) {
        super(children, name);
        this.firstLine = firstLine;
        this.lastLine = lastLine;
    }

    public BlockNode() {

    }

    public BlockNode(int firstLine, int lastLine) {
        super();
        this.firstLine = firstLine;
        this.lastLine = lastLine;
    }

    public BlockNode(List<Node> children, String name) {
        super(children, name);
    }

    public int getFirstLine() {
        return firstLine;
    }

    public int getLastLine() {
        return lastLine;
    }
}
