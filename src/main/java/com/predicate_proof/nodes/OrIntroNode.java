package com.predicate_proof.nodes;

public class OrIntroNode extends RuleNode {

    private boolean ruleEinsTrueZweiFalse;
    private int singleScope;

    public OrIntroNode(boolean ruleEinsTrueZweiFalse, int singleScope) {
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
