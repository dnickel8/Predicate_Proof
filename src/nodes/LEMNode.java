package nodes;

public class LEMNode extends RuleNode {

    private Integer singleScope;

    public LEMNode(int singleScope) {
        this.singleScope = singleScope;
    }

    public LEMNode() {
    }

    public int getSingleScope() {
        return singleScope;
    }
}
