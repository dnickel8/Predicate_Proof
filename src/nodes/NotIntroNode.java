package nodes;

public class NotIntroNode extends RuleNode {

    private int multiScopeFirstLine;
    private int mulitScopeLastLine;

    public NotIntroNode(int multiScopeFirstLine, int mulitScopeLastLine) {
        this.multiScopeFirstLine = multiScopeFirstLine;
        this.mulitScopeLastLine = mulitScopeLastLine;
    }

    public int getMultiScopeFirstLine() {
        return multiScopeFirstLine;
    }

    public int getMulitScopeLastLine() {
        return mulitScopeLastLine;
    }
}
