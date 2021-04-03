package com.predicate_proof.nodes;

/**
 * andElimination1
 * :
 *     AND 'e1' singleScope
 * ;
 *
 * andElimination2
 * :
 *     AND 'e2' singleScope
 * ;
 * @author David Nickel
 */
public class AndEliNode extends RuleNode {

    private final boolean ruleEinsTrueZweiFalse;
    private final int singleScope;

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
