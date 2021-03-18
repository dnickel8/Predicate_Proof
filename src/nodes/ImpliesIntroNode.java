package nodes;

public class ImpliesIntroNode extends RuleNode {

    private int mulitScopeFirstLine;
    private int mulitScopeLastLine;

    public ImpliesIntroNode(int mulitScopeFirstLine, int mulitScopeLastLine) {
        this.mulitScopeFirstLine = mulitScopeFirstLine;
        this.mulitScopeLastLine = mulitScopeLastLine;
    }

    public int getMulitScopeFirstLine() {
        return mulitScopeFirstLine;
    }

    public int getMulitScopeLastLine() {
        return mulitScopeLastLine;
    }
}
