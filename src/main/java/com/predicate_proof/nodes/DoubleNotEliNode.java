package com.predicate_proof.nodes;

/**
 * doubleNotElimination
 * :
 *     NOT NOT 'e' singleScope
 * ;
 * @author David Nickel
 */
public class DoubleNotEliNode extends RuleNode {

    private final int singleScope;

    public DoubleNotEliNode(int singleScope) {
        this.singleScope = singleScope;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
