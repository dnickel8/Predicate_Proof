package com.predicate_proof.nodes;

/**
 * excludedMiddle
 * :
 *     'LEM' singleScope
 *     | 'LEM'
 * ;
 * @author David Nickel
 */
public class LEMNode extends RuleNode {

    private final Integer singleScope;

    public LEMNode(int singleScope) {
        this.singleScope = singleScope;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
