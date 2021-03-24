package com.predicate_proof.nodes;

public class ExistEliNode extends RuleNode {
    private String variable;
    private int singleScope;
    private int multiScopeFirstLine;
    private int multiScopeLastLine;

    public ExistEliNode(String variable, int singleScope, int multiScopeFirstLine, int multiScopeLastLine) {
        this.variable = variable;
        this.singleScope = singleScope;
        this.multiScopeFirstLine = multiScopeFirstLine;
        this.multiScopeLastLine = multiScopeLastLine;
    }

    public String getVariable() {
        return variable;
    }

    public int getSingleScope() {
        return singleScope;
    }

    public int getMultiScopeFirstLine() {
        return multiScopeFirstLine;
    }

    public int getMultiScopeLastLine() {
        return multiScopeLastLine;
    }
}
