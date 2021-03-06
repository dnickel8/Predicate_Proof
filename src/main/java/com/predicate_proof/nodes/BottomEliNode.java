package com.predicate_proof.nodes;

/**
 * bottomElimination
 * :
 *     BOTTOM 'e' singleScope
 * ;
 *
 * @author David Nickel
 */
public class BottomEliNode extends RuleNode {

    private final int singleScope;

    public BottomEliNode(int singleScope) {
        this.singleScope = singleScope;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
