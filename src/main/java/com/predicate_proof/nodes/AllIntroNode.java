package com.predicate_proof.nodes;

public class AllIntroNode extends RuleNode {

    private String variable;
    private int multiScopeFirstLine;
    private int multiScopeLastLine;

    public AllIntroNode(String variable, int multiScopeFirstLine, int multiScopeLastLine) {
        this.variable = variable;
        this.multiScopeFirstLine = multiScopeFirstLine;
        this.multiScopeLastLine = multiScopeLastLine;
    }

    public String getVariable() {
        return variable;
    }

    public int getMultiScopeFirstLine() {
        return multiScopeFirstLine;
    }

    public int getMultiScopeLastLine() {
        return multiScopeLastLine;
    }
}
