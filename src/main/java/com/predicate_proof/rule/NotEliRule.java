package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.nodes.UnaryOperatorNode;

/**
 *  \ll
 *      1 q \mid premise \\
 *      2 \neg q \mid premise \\
 *      3 \bot \mid \neg e 1,2 \\
 *  \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class NotEliRule extends Rule {

    public boolean check(Node beforeFormula1,
                         Node beforeFormula2,
                         Node afterFormula) {
        /*
        It is not known which of the beforeFormulas is the negation of the other.
        That´s why three possibilities that are tested. Both are negation or only one of them.
         */
        if(beforeFormula1 instanceof UnaryOperatorNode
                && ((UnaryOperatorNode) beforeFormula1).getOperator() == RelationOperator.NOT
                && beforeFormula2 instanceof UnaryOperatorNode
                && ((UnaryOperatorNode) beforeFormula2).getOperator() == RelationOperator.NOT) {
            return helpMethod(beforeFormula1, (UnaryOperatorNode) beforeFormula2, afterFormula)
                    || helpMethod(beforeFormula2, (UnaryOperatorNode) beforeFormula1, afterFormula);
        } else if (beforeFormula1 instanceof UnaryOperatorNode
                && ((UnaryOperatorNode) beforeFormula1).getOperator() == RelationOperator.NOT) {
            return helpMethod(beforeFormula2, (UnaryOperatorNode) beforeFormula1, afterFormula);
        } else if (beforeFormula2 instanceof UnaryOperatorNode
                && ((UnaryOperatorNode) beforeFormula2).getOperator() == RelationOperator.NOT) {
            return helpMethod(beforeFormula1, (UnaryOperatorNode) beforeFormula2, afterFormula);
        } else {
            return false;
        }
    }

    private boolean helpMethod(Node positivNode,
                        UnaryOperatorNode negativNode,
                        Node afterNode) {

        if (negativNode.getOperator() == RelationOperator.NOT
                && afterNode instanceof BottomNode) {
            return equals(positivNode,negativNode.getExpression());
        } else {
            return false;
        }
    }
}
