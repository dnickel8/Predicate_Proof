package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.Node;

/**
 *  \ll
 *      1 \neg p \vee p \mid LEM \\
 *  \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class LEMRule extends Rule {


    public boolean check(Node beforeNode,
                         FormulaNode afterNode) {
        //LEM can be applied to a line with bottom without an beforeNode
        if (beforeNode == null
                || beforeNode instanceof BottomNode) {
            if (afterNode.getOperator() == RelationOperator.OR) {
                //the two operators should be the same but negated.
                return negativeEquals(afterNode.getLeftExpression(), afterNode.getRightExpression());
            }
        }
        return false;
    }

    //if there is no lineNumber given in the rule description
    public boolean check(FormulaNode afterNode) {
        return check(null, afterNode);
    }
}
