package com.predicate_proof.nodes;

/**
 * allquantorElimination
 * :
 *     ALLQUANTOR variable 'e' singleScope
 * ;
 * @author David Nickel
 */
public class AllEliNode extends RuleNode {

    private final String variable;
    private final int singleScope;

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
