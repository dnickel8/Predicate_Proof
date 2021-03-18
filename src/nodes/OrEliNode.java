package nodes;

public class OrEliNode extends RuleNode {

    private int singleScope;
    private int multiScopeFirstLine1;
    private int multiScopeLastLine1;
    private int multiScopeFirstLine2;
    private int multiScopeLastLine2;

    public OrEliNode(int singleScope,
                     int multiScopeFirstLine1,
                     int multiScopeLastLine1,
                     int multiScopeFirstLine2,
                     int multiScopeLastLine2) {
        this.singleScope = singleScope;
        this.multiScopeFirstLine1 = multiScopeFirstLine1;
        this.multiScopeLastLine1 = multiScopeLastLine1;
        this.multiScopeFirstLine2 = multiScopeFirstLine2;
        this.multiScopeLastLine2 = multiScopeLastLine2;
    }

    public int getSingleScope() {
        return singleScope;
    }

    public int getMultiScopeFirstLine1() {
        return multiScopeFirstLine1;
    }

    public int getMultiScopeLastLine1() {
        return multiScopeLastLine1;
    }

    public int getMultiScopeFirstLine2() {
        return multiScopeFirstLine2;
    }

    public int getMultiScopeLastLine2() {
        return multiScopeLastLine2;
    }
}
