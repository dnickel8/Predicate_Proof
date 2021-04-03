package com.predicate_proof.nodes;

/**
 * existsquantorIntroduction
 * :
 *     EXISTQUANTOR variable 'i' singleScope
 * ;
 * @author David Nickel
 */
public class ExistIntroNode extends RuleNode {

    private final String variable;
    private final int singleScope;

    public ExistIntroNode(String variable, int singleScope) {
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
