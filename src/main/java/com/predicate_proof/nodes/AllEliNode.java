package com.predicate_proof.nodes;

public class AllEliNode extends RuleNode {

    private String variable;
    private int singleScope;

    public AllEliNode(String variable, int singleScope) {
        this.variable = variable;
        this.singleScope = singleScope;
    }

    public String getVariable() {
        return variable;
    }

    public int getSingleScope() {
        return singleScope;
    }
}
