package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.*;

import java.text.Normalizer;

/**
 *
 * \\ll
 *      x = y \\mid premise \\
 *      x -> z \\mid premsie \\
 *      y -> z \\mid =e 1,2 \\
 * \\gg
 * @author David Nickel
 */
public class EqualsEliRule extends Rule {

    public boolean check(Node beforeNode1,
                         Node beforeNode2,
                         Node afterNode) {
        if (beforeNode1 instanceof FormulaNode
                && (((FormulaNode) beforeNode1).getOperator() == RelationOperator.EQUIVALENZ
                || ((FormulaNode) beforeNode1).getOperator() == RelationOperator.EQ)) {
            return equalsReplacingTerm(beforeNode2, afterNode, ((FormulaNode) beforeNode1).getLeftExpression(), ((FormulaNode) beforeNode1).getRightExpression())
                    || equalsReplacingTerm(beforeNode2, afterNode, ((FormulaNode) beforeNode1).getRightExpression(), ((FormulaNode) beforeNode1).getLeftExpression());
        } else {
            return false;
        }
    }

    private boolean equalsReplacingTerm(Node beforeReplacing, Node afterReplacing, Node toReplace, Node replacedWith){
        if (toReplace instanceof VariableNode) {
            return equalsReplacingVariable(beforeReplacing, afterReplacing, (VariableNode) toReplace, replacedWith);
        } else if (toReplace instanceof UnaryOperatorNode) {
            return equalsReplacingUnaryOperator(beforeReplacing, afterReplacing, (UnaryOperatorNode) toReplace, replacedWith);
        } else if (toReplace instanceof FormulaNode) {
            return equalsReplacingFormula(beforeReplacing, afterReplacing, (FormulaNode) toReplace, replacedWith);
        } else if (toReplace instanceof PredicateNode) {
            return equalsReplacingPredicate(beforeReplacing, afterReplacing, (PredicateNode) toReplace, replacedWith);
        } else {
            return false;
        }
    }

    private boolean equalsReplacingVariable(Node beforeReplacing, Node afterReplacing, VariableNode toReplace, Node replacedWith) {
        if (beforeReplacing instanceof VariableNode && equals(beforeReplacing,toReplace)) {
            return equals(afterReplacing, replacedWith);
        } else if (beforeReplacing instanceof VariableNode && afterReplacing instanceof VariableNode) {
            return equals(beforeReplacing, afterReplacing);
        } else if (beforeReplacing instanceof UnaryOperatorNode && afterReplacing instanceof UnaryOperatorNode) {
            if (((UnaryOperatorNode) beforeReplacing).getOperator() == ((UnaryOperatorNode) afterReplacing).getOperator()) {
                if (((UnaryOperatorNode) beforeReplacing).getOperator() == RelationOperator.NOT) {
                    return equalsReplacingVariable(((UnaryOperatorNode) beforeReplacing).getExpression(), ((UnaryOperatorNode) afterReplacing).getExpression(), toReplace, replacedWith);
                } else {
                    return ((UnaryOperatorNode) beforeReplacing).getVariable().equals(((UnaryOperatorNode) afterReplacing).getVariable())
                            && equalsReplacingVariable(((UnaryOperatorNode) beforeReplacing).getExpression(), ((UnaryOperatorNode) afterReplacing).getExpression(), toReplace, replacedWith);
                }
            } else {
                return false;
            }
        } else if (beforeReplacing instanceof FormulaNode && afterReplacing instanceof FormulaNode) {
            if (((FormulaNode) beforeReplacing).getOperator() == ((FormulaNode) afterReplacing).getOperator()) {
                return equalsReplacingVariable(((FormulaNode) beforeReplacing).getLeftExpression(), ((FormulaNode) afterReplacing).getLeftExpression(), toReplace, replacedWith)
                        && equalsReplacingVariable(((FormulaNode) beforeReplacing).getRightExpression(), ((FormulaNode) afterReplacing).getRightExpression(), toReplace, replacedWith);
            } else {
                return false;
            }
        } else if (beforeReplacing instanceof PredicateNode && afterReplacing instanceof PredicateNode) {
            if (!(((PredicateNode) beforeReplacing).getPredicateName().equals(((PredicateNode) afterReplacing).getPredicateName()))) {
                return false;
            } else if (((PredicateNode) beforeReplacing).getParameter().size() != ((PredicateNode) afterReplacing).getParameter().size()) {
                return false;
            } else {
                for (int i = 0; i< ((PredicateNode) beforeReplacing).getParameter().size(); i++) {
                    if (!equalsReplacingTerm(((PredicateNode) beforeReplacing).getParameterByIndex(i), ((PredicateNode) afterReplacing).getParameterByIndex(i), toReplace, replacedWith)) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean equalsReplacingUnaryOperator(Node beforeReplacing, Node afterReplacing, UnaryOperatorNode toReplace, Node replacedWith) {
        if (beforeReplacing instanceof VariableNode && afterReplacing instanceof VariableNode) {
            return equals(beforeReplacing, afterReplacing);
        } else if (beforeReplacing instanceof UnaryOperatorNode && equals(beforeReplacing, toReplace)) {
            return equals(afterReplacing,replacedWith);
        }else if (beforeReplacing instanceof UnaryOperatorNode && afterReplacing instanceof UnaryOperatorNode) {
            if (((UnaryOperatorNode) beforeReplacing).getOperator() == ((UnaryOperatorNode) afterReplacing).getOperator()) {
                if (((UnaryOperatorNode) beforeReplacing).getOperator() == RelationOperator.NOT) {
                    return equalsReplacingUnaryOperator(((UnaryOperatorNode) beforeReplacing).getExpression(), ((UnaryOperatorNode) afterReplacing).getExpression(), toReplace, replacedWith);
                } else {
                    return ((UnaryOperatorNode) beforeReplacing).getVariable().equals(((UnaryOperatorNode) afterReplacing).getVariable())
                            && equalsReplacingUnaryOperator(((UnaryOperatorNode) beforeReplacing).getExpression(), ((UnaryOperatorNode) afterReplacing).getExpression(), toReplace, replacedWith);
                }
            } else {
                return false;
            }
        } else if (beforeReplacing instanceof FormulaNode && afterReplacing instanceof FormulaNode) {
            if (((FormulaNode) beforeReplacing).getOperator() == ((FormulaNode) afterReplacing).getOperator()) {
                return equalsReplacingUnaryOperator(((FormulaNode) beforeReplacing).getLeftExpression(), ((FormulaNode) afterReplacing).getLeftExpression(), toReplace, replacedWith)
                        && equalsReplacingUnaryOperator(((FormulaNode) beforeReplacing).getRightExpression(), ((FormulaNode) afterReplacing).getRightExpression(), toReplace, replacedWith);
            } else {
                return false;
            }
        } else if (beforeReplacing instanceof PredicateNode && afterReplacing instanceof PredicateNode) {
            if (!(((PredicateNode) beforeReplacing).getPredicateName().equals(((PredicateNode) afterReplacing).getPredicateName()))) {
                return false;
            } else if (((PredicateNode) beforeReplacing).getParameter().size() != ((PredicateNode) afterReplacing).getParameter().size()) {
                return false;
            } else {
                for (int i = 0; i< ((PredicateNode) beforeReplacing).getParameter().size(); i++) {
                    if (!equalsReplacingTerm(((PredicateNode) beforeReplacing).getParameterByIndex(i), ((PredicateNode) afterReplacing).getParameterByIndex(i), toReplace, replacedWith)) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean equalsReplacingFormula(Node beforeReplacing, Node afterReplacing, FormulaNode toReplace, Node replacedWith) {
        if (beforeReplacing instanceof VariableNode && afterReplacing instanceof VariableNode) {
            return equals(beforeReplacing, afterReplacing);
        } else if (beforeReplacing instanceof UnaryOperatorNode && afterReplacing instanceof UnaryOperatorNode) {
            if (((UnaryOperatorNode) beforeReplacing).getOperator() == ((UnaryOperatorNode) afterReplacing).getOperator()) {
                if (((UnaryOperatorNode) beforeReplacing).getOperator() == RelationOperator.NOT) {
                    return equalsReplacingFormula(((UnaryOperatorNode) beforeReplacing).getExpression(), ((UnaryOperatorNode) afterReplacing).getExpression(), toReplace, replacedWith);
                } else {
                    return ((UnaryOperatorNode) beforeReplacing).getVariable().equals(((UnaryOperatorNode) afterReplacing).getVariable())
                            && equalsReplacingFormula(((UnaryOperatorNode) beforeReplacing).getExpression(), ((UnaryOperatorNode) afterReplacing).getExpression(), toReplace, replacedWith);
                }
            } else {
                return false;
            }
        } else if (beforeReplacing instanceof FormulaNode && equals(beforeReplacing,toReplace)) {
            return equals(afterReplacing, replacedWith);
        } else if (beforeReplacing instanceof FormulaNode && afterReplacing instanceof FormulaNode) {
            if (((FormulaNode) beforeReplacing).getOperator() == ((FormulaNode) afterReplacing).getOperator()) {
                return equalsReplacingFormula(((FormulaNode) beforeReplacing).getLeftExpression(), ((FormulaNode) afterReplacing).getLeftExpression(), toReplace, replacedWith)
                        && equalsReplacingFormula(((FormulaNode) beforeReplacing).getRightExpression(), ((FormulaNode) afterReplacing).getRightExpression(), toReplace, replacedWith);
            } else {
                return false;
            }
        } else if (beforeReplacing instanceof PredicateNode && afterReplacing instanceof PredicateNode) {
            if (!(((PredicateNode) beforeReplacing).getPredicateName().equals(((PredicateNode) afterReplacing).getPredicateName()))) {
                return false;
            } else if (((PredicateNode) beforeReplacing).getParameter().size() != ((PredicateNode) afterReplacing).getParameter().size()) {
                return false;
            } else {
                for (int i = 0; i< ((PredicateNode) beforeReplacing).getParameter().size(); i++) {
                    if (!equalsReplacingTerm(((PredicateNode) beforeReplacing).getParameterByIndex(i), ((PredicateNode) afterReplacing).getParameterByIndex(i), toReplace, replacedWith)) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean equalsReplacingPredicate(Node beforeReplacing, Node afterReplacing, PredicateNode toReplace, Node replacedWith) {
        if (beforeReplacing instanceof VariableNode && afterReplacing instanceof VariableNode) {
            return equals(beforeReplacing, afterReplacing);
        } else if (beforeReplacing instanceof UnaryOperatorNode && afterReplacing instanceof UnaryOperatorNode) {
            if (((UnaryOperatorNode) beforeReplacing).getOperator() == ((UnaryOperatorNode) afterReplacing).getOperator()) {
                if (((UnaryOperatorNode) beforeReplacing).getOperator() == RelationOperator.NOT) {
                    return equalsReplacingPredicate(((UnaryOperatorNode) beforeReplacing).getExpression(), ((UnaryOperatorNode) afterReplacing).getExpression(), toReplace, replacedWith);
                } else {
                    return ((UnaryOperatorNode) beforeReplacing).getVariable().equals(((UnaryOperatorNode) afterReplacing).getVariable())
                            && equalsReplacingPredicate(((UnaryOperatorNode) beforeReplacing).getExpression(), ((UnaryOperatorNode) afterReplacing).getExpression(), toReplace, replacedWith);
                }
            } else {
                return false;
            }
        } else if (beforeReplacing instanceof FormulaNode && afterReplacing instanceof FormulaNode) {
            if (((FormulaNode) beforeReplacing).getOperator() == ((FormulaNode) afterReplacing).getOperator()) {
                return equalsReplacingPredicate(((FormulaNode) beforeReplacing).getLeftExpression(), ((FormulaNode) afterReplacing).getLeftExpression(), toReplace, replacedWith)
                        && equalsReplacingPredicate(((FormulaNode) beforeReplacing).getRightExpression(), ((FormulaNode) afterReplacing).getRightExpression(), toReplace, replacedWith);
            } else {
                return false;
            }
        } else if (beforeReplacing instanceof PredicateNode && equals(beforeReplacing,toReplace)) {
            return equals(afterReplacing, replacedWith);
        } else if (beforeReplacing instanceof PredicateNode && afterReplacing instanceof PredicateNode) {
            if (!(((PredicateNode) beforeReplacing).getPredicateName().equals(((PredicateNode) afterReplacing).getPredicateName()))) {
                return false;
            } else if (((PredicateNode) beforeReplacing).getParameter().size() != ((PredicateNode) afterReplacing).getParameter().size()) {
                return false;
            } else {
                for (int i = 0; i< ((PredicateNode) beforeReplacing).getParameter().size(); i++) {
                    if (!equalsReplacingTerm(((PredicateNode) beforeReplacing).getParameterByIndex(i), ((PredicateNode) afterReplacing).getParameterByIndex(i), toReplace, replacedWith)) {
                        return false;
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
