package com.predicate_proof.nodes;

public class BottomEliNode extends RuleNode {

    private int singleScope;

    public BottomEliNode(int singleScope) {
        this.singleScope = singleScope;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
