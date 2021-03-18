package nodes;

public class AndEliNode extends RuleNode {

    private boolean ruleEinsTrueZweiFalse;
    private int singleScope;

    public AndEliNode(boolean ruleEinsTrueZweiFalse, int singleScope) {
        this.ruleEinsTrueZweiFalse = ruleEinsTrueZweiFalse;
        this.singleScope = singleScope;
    }

    public boolean isRuleEinsTrueZweiFalse() {
        return ruleEinsTrueZweiFalse;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
