package nodes;

public class PBCNode extends RuleNode {

    private int multiScopeFirstLine;
    private int multiScopeLastLine;

    public PBCNode(int multiScopeFirstLine, int multiScopeLastLine) {
        this.multiScopeFirstLine = multiScopeFirstLine;
        this.multiScopeLastLine = multiScopeLastLine;
    }

    public int getMultiScopeFirstLine() {
        return multiScopeFirstLine;
    }

    public int getMultiScopeLastLine() {
        return multiScopeLastLine;
    }
}
