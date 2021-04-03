package com.predicate_proof.nodes;

/**
 * doubleNotIntroduction
 * :
 *     NOT NOT 'i' singleScope
 * ;
 * @author David Nickel
 */
public class DoubleNotIntroNode extends RuleNode {

    private final int singleScope;

    public DoubleNotIntroNode(int singleScope) {
        this.singleScope = singleScope;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
