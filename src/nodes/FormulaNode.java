package nodes;

import copied.RelationOperator;

public class FormulaNode extends Node{
    private Node leftExpression;
    private RelationOperator operator;
    private Node rightExpression;

    public Node getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(Node leftExpression) {
        this.leftExpression = leftExpression;
    }

    public RelationOperator getOperator() {
        return operator;
    }

    public void setOperator(RelationOperator operator) {
        this.operator = operator;
    }

    public Node getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(Node rightExpression) {
        this.rightExpression = rightExpression;
    }

    public FormulaNode searchOperator(RelationOperator operator) {
        if (this.operator == operator) {
            return this;
        } else {
            FormulaNode node = new FormulaNode();
            if((node = ((FormulaNode) leftExpression).searchOperator(operator)) != null) {
                return node;
            } else if ((node = ((FormulaNode) rightExpression).searchOperator(operator)) != null) {
                return node;
            } else {
                return null;
            }
        }
    }
}
