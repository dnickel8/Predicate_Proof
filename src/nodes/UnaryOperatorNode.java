package nodes;

import copied.RelationOperator;

public class UnaryOperatorNode extends Node{
    private RelationOperator operator;
    private String variable;
    private Node expression;

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
