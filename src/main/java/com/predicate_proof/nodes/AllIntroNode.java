package com.predicate_proof.nodes;

/**
 * allquantorIntroduction
 * :
 *     ALLQUANTOR variable 'i' multiScope
 * ;
 * @author David Nickel
 */
public class AllIntroNode extends RuleNode {

    private final String variable;
    private final int multiScopeFirstLine;
    private final int multiScopeLastLine;

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
