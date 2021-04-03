package com.predicate_proof.nodes;

/**
 * @author David Nickel
 */
public class VariableNode extends Node{
    private final String variable;

    public VariableNode(String variable) {
        this.variable = variable;
    }

    public String getVariable() {
        return variable;
    }
}
