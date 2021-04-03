package com.predicate_proof.nodes;

/**
 * orIntroduction1
 * :
 *     OR 'i1' singleScope
 * ;
 *
 * orIntroduction2
 * :
 *     OR 'i2' singleScope
 * ;
 * @author David Nickel
 */
public class OrIntroNode extends RuleNode {

    private final boolean ruleEinsTrueZweiFalse;
    private final int singleScope;

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
