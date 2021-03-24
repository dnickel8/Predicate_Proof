package com.predicate_proof.nodes;

public class DoubleNotIntroNode extends RuleNode {

    private int singleScope;

    public DoubleNotIntroNode(int singleScope) {
        this.singleScope = singleScope;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
