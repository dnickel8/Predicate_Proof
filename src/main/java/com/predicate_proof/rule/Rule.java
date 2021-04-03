package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.*;

/**
 * Declares methods needed to check the proof rules
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public abstract class Rule {

    private String toReplace;

    /**
     * Checks whether the nodes are equal.
     * @param node1
     * @param node2
     * @return boolean
     */
    protected boolean equals(Node node1, Node node2) {
        if (node1 instanceof VariableNode && node2 instanceof VariableNode) {
            return ((VariableNode) node1).getVariable().equals(((VariableNode) node2).getVariable());
        }

        else if (node1 instanceof UnaryOperatorNode && node2 instanceof UnaryOperatorNode) {
            if (! (((UnaryOperatorNode) node1).getOperator().equals(((UnaryOperatorNode) node2).getOperator()))) {
                return false;
            }else if (((UnaryOperatorNode) node1).getOperator() != RelationOperator.NOT
                    && !(((UnaryOperatorNode) node1).getVariable().equals(((UnaryOperatorNode) node2).getVariable()))) {
                return false;
            } else {
                return equals(((UnaryOperatorNode) node1).getExpression(), ((UnaryOperatorNode) node2).getExpression());
            }
        }

        else if (node1 instanceof FormulaNode && node2 instanceof FormulaNode) {
            if (!(((FormulaNode) node1).getOperator().equals(((FormulaNode) node2).getOperator()))) {
                return false;
            } else if (!(equals(((FormulaNode) node1).getLeftExpression(), ((FormulaNode) node2).getLeftExpression()))){
                return false;
            } else {
                return equals(((FormulaNode) node1).getRightExpression(), ((FormulaNode) node2).getRightExpression());
            }
        }

        else if (node1 instanceof PredicateNode && node2 instanceof PredicateNode) {
            if (!(((PredicateNode) node1).getPredicateName().equals(((PredicateNode) node2).getPredicateName()))) {
                return false;
            }
            if (((PredicateNode) node1).getParameter().size() != ((PredicateNode) node2).getParameter().size()) {
                return false;
            }
            for (int i = 0; i< ((PredicateNode) node1).getParameter().size(); i++) {
                if (!equals(((PredicateNode) node1).getParameterByIndex(i), ((PredicateNode) node2).getParameterByIndex(i))) {
                    return false;
                }
            }
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * Checks whether the three nodes are equal
     * @param node1
     * @param node2
     * @param node3
     * @return boolean
     */
    protected boolean equals(Node node1, Node node2, Node node3) {
        return (equals(node1, node2) && equals(node2, node3) && equals(node1, node3));
    }

    /**
     * Checks whether the two nodes are negated to each other.
     * @param node1
     * @param node2
     * @return boolean
     */
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

    /**
     * Checks whether the two nodes are equal
     * except one variable from beforeReplacing is replaced with variable in afterReplacing
     * @param variable
     * @param beforeReplacing
     * @param afterReplacing
     * @return
     */
    protected boolean replacingVariableEquals (String variable, Node beforeReplacing, Node afterReplacing) {
        toReplace = null;
        return replacingVariableEquals2(variable, beforeReplacing, afterReplacing);
    }

    /**
     * Checks whether the two nodes are equal
     * except beforeVariable from beforeReplacing is replaced with afterVariable in afterReplacing
     * @param beforeVariable
     * @param afterVariable
     * @param beforeReplacing
     * @param afterReplacing
     * @return
     */
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
        }

        else if (beforeReplacing instanceof UnaryOperatorNode && afterReplacing instanceof UnaryOperatorNode) {
            if (!(((UnaryOperatorNode) beforeReplacing).getOperator().equals(((UnaryOperatorNode) afterReplacing).getOperator()))) {
                return false;
            } else if (((UnaryOperatorNode) beforeReplacing).getOperator() != RelationOperator.NOT
                    && !(((UnaryOperatorNode) beforeReplacing).getVariable().equals(((UnaryOperatorNode) afterReplacing).getVariable()))) {
                return false;
            } else {
                return replacingVariableEquals2(variable, ((UnaryOperatorNode) beforeReplacing).getExpression(), ((UnaryOperatorNode) afterReplacing).getExpression());
            }
        }

        else if (beforeReplacing instanceof FormulaNode && afterReplacing instanceof FormulaNode) {
            if (!(((FormulaNode) beforeReplacing).getOperator().equals(((FormulaNode) afterReplacing).getOperator()))) {
                return false;
            } else if (!(replacingVariableEquals2(variable,((FormulaNode) beforeReplacing).getLeftExpression(),(((FormulaNode) afterReplacing).getLeftExpression())))){
                return false;
            } else {
                return replacingVariableEquals2(variable,((FormulaNode) beforeReplacing).getRightExpression(), ((FormulaNode) afterReplacing).getRightExpression());
            }
        }

        else if (beforeReplacing instanceof PredicateNode && afterReplacing instanceof PredicateNode) {
            if (!(((PredicateNode) beforeReplacing).getPredicateName().equals(((PredicateNode) afterReplacing).getPredicateName()))) {
                return false;
            }
            if (((PredicateNode) beforeReplacing).getParameter().size() != ((PredicateNode) afterReplacing).getParameter().size()) {
                return false;
            }
            for (int i = 0; i< ((PredicateNode) beforeReplacing).getParameter().size(); i++) {
                if (!replacingVariableEquals2(variable, ((PredicateNode) beforeReplacing).getParameterByIndex(i), ((PredicateNode) afterReplacing).getParameterByIndex(i))) {
                    return false;
                }
            }
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * checks whether the variable not is in the formula
     * @param declaredVariable
     * @param formula
     * @return
     */
    protected boolean variableNotInFormula(String declaredVariable, Node formula) {
        if (formula instanceof VariableNode) {
            return !declaredVariable.equals(((VariableNode) formula).getVariable());
        } else if (formula instanceof FormulaNode) {
            for (Node child : formula.getChildren()) {
                if (!variableNotInFormula(declaredVariable,child)) {
                    return false;
                }
            }
            return true;
        } else if (formula instanceof PredicateNode) {
            for (Node child : ((PredicateNode) formula).getParameter()) {
                if (!variableNotInFormula(declaredVariable,child)) {
                    return false;
                }
            }
            return true;
        } else if (formula instanceof UnaryOperatorNode) {
            return variableNotInFormula(declaredVariable,((UnaryOperatorNode) formula).getExpression());
        } else {
            return true;
        }
    }
}
