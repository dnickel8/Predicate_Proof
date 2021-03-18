package nodes;

public class DoubleNotEliNode extends RuleNode {

    private int singleScope;

    public DoubleNotEliNode(int singleScope) {
        this.singleScope = singleScope;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
