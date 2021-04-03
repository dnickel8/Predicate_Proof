package com.predicate_proof.nodes;

import com.predicate_proof.copied.RelationOperator;

/**
 * @author David Nickel
 */
public class UnaryOperatorNode extends Node{
    private RelationOperator operator;
    private String variable;
    private Node expression;

    public UnaryOperatorNode(RelationOperator operator, String variable, Node expression) {
        this.operator = operator;
        this.variable = variable;
        this.expression = expression;
    }

    public UnaryOperatorNode(RelationOperator operator) {
        this.operator = operator;
    }

    public UnaryOperatorNode() {

    }

    public RelationOperator getOperator() {
        return operator;
    }

    public void setOperator(RelationOperator operator) {
        this.operator = operator;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public Node getExpression() {
        return expression;
    }

    public void setExpression(Node expression) {
        this.expression = expression;
    }
}
