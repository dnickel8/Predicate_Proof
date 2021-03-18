package rule;

import copied.RelationOperator;
import nodes.FormulaNode;
import nodes.Node;
import nodes.UnaryOperatorNode;
import nodes.VariableNode;

public abstract class Rule {

    private String toReplace;

    protected boolean equals(Node node1, Node node2) {
        if (node1 instanceof VariableNode && node2 instanceof VariableNode) {
            return ((VariableNode) node1).getVariable().equals(((VariableNode) node2).getVariable());
        } else if (node1 instanceof UnaryOperatorNode && node2 instanceof UnaryOperatorNode) {
            if (! (((UnaryOperatorNode) node1).getOperator().equals(((UnaryOperatorNode) node2).getOperator()))) {
                return false;
            }else if (((UnaryOperatorNode) node1).getOperator() != RelationOperator.NOT
                    && !(((UnaryOperatorNode) node1).getVariable().equals(((UnaryOperatorNode) node2).getVariable()))) {
                return false;
            } else {
                return equals(((UnaryOperatorNode) node1).getExpression(), ((UnaryOperatorNode) node2).getExpression());
            }
        } else if (node1 instanceof FormulaNode && node2 instanceof FormulaNode) {
            if (!(((FormulaNode) node1).getOperator().equals(((FormulaNode) node2).getOperator()))) {
                return false;
            } else if (!(equals(((FormulaNode) node1).getLeftExpression(), ((FormulaNode) node2).getLeftExpression()))){
                return false;
            } else {
                return equals(((FormulaNode) node1).getRightExpression(), ((FormulaNode) node2).getRightExpression());
            }
        } else {
            return false;
        }
    }

    protected boolean equals(Node node1, Node node2, Node node3) {
        return (equals(node1, node2) && equals(node2, node3) && equals(node1, node3));
    }

    protected boolean negativeEquals(Node node1, Node node2) {
        if (node1 instanceof UnaryOperatorNode
                && ((UnaryOperatorNode) node1).getOperator() == RelationOperator.NOT) {
            if (node2 instanceof UnaryOperatorNode
                    && ((UnaryOperatorNode) node2).getOperator() == RelationOperator.NOT) {
                return negativeEquals(((UnaryOperatorNode) node1).getExpression(),
                        ((UnaryOperatorNode) node2).getExpression());
            } else {
                return equals(((UnaryOperatorNode) node1).getExpression(),node2);
            }
        } else if (node2 instanceof UnaryOperatorNode
                && ((UnaryOperatorNode) node2).getOperator() == RelationOperator.NOT) {
            return equals(node1, ((UnaryOperatorNode) node2).getExpression());
        } else {
            return false;
        }
    }

    protected boolean replacingVariableEquals (String variable, Node beforeReplacing, Node afterReplacing) {
        toReplace = null;
        return replacingVariableEquals2(variable, beforeReplacing, afterReplacing);
    }

    protected boolean replacingVariableEquals (String beforeVariable, String afterVariable, Node beforeReplacing, Node afterReplacing) {
        toReplace = beforeVariable;
        return replacingVariableEquals2(afterVariable, beforeReplacing, afterReplacing);
    }

    private boolean replacingVariableEquals2 (String variable, Node beforeReplacing, Node afterReplacing) {
        if (beforeReplacing instanceof VariableNode && afterReplacing instanceof VariableNode) {
            if (((VariableNode) afterReplacing).getVariable().equals(variable)) {
                if (toReplace == null)
                {
                    toReplace = ((VariableNode) beforeReplacing).getVariable();
                    return true;
                } else {
                    return toReplace.equals(((VariableNode) beforeReplacing).getVariable());
                }
            }
            return ((VariableNode) beforeReplacing).getVariable().equals(((VariableNode) afterReplacing).getVariable());

        } else if (beforeReplacing instanceof UnaryOperatorNode && afterReplacing instanceof UnaryOperatorNode) {
            if (! (((UnaryOperatorNode) beforeReplacing).getOperator().equals(((UnaryOperatorNode) afterReplacing).getOperator()))) {
                return false;
            }else if (!(((UnaryOperatorNode) beforeReplacing).getVariable().equals(((UnaryOperatorNode) afterReplacing).getVariable()))) {
                return false;
            } else {
                return replacingVariableEquals2(variable, ((UnaryOperatorNode) beforeReplacing).getExpression(), ((UnaryOperatorNode) afterReplacing).getExpression());
            }
        } else if (beforeReplacing instanceof FormulaNode && afterReplacing instanceof FormulaNode) {
            if (!(((FormulaNode) beforeReplacing).getOperator().equals(((FormulaNode) afterReplacing).getOperator()))) {
                return false;
            } else if (!(replacingVariableEquals2(variable,((FormulaNode) beforeReplacing).getLeftExpression(),(((FormulaNode) afterReplacing).getLeftExpression())))){
                return false;
            } else {
                return replacingVariableEquals2(variable,((FormulaNode) beforeReplacing).getRightExpression(), ((FormulaNode) afterReplacing).getRightExpression());
            }
        }
        return false;
    }
}
