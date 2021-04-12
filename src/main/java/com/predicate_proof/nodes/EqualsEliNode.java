package com.predicate_proof.nodes;


/**
 * @author David Nickel
 */
public class EqualsEliNode extends RuleNode {
    private final int singleScope1;
    private final int singleScope2;

    public EqualsEliNode(int singleScope1, int singleScope2) {
        this.singleScope1 = singleScope1;
        this.singleScope2 = singleScope2;
    }

    public int getSingleScope1() {
        return singleScope1;
    }

    public int getSingleScope2() {
        return singleScope2;
    }
}
