package com.predicate_proof.nodes;

/**
 * existsquantorElimination
 * :
 *     EXISTQUANTOR variable 'e' singleScope COMMA multiScope
 * ;
 * @author David Nickel
 */
public class ExistEliNode extends RuleNode {
    private final String variable;
    private final int singleScope;
    private final int multiScopeFirstLine;
    private final int multiScopeLastLine;

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
