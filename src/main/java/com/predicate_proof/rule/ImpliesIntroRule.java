package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.LineNode;
import com.predicate_proof.nodes.Node;

/**
 *  \ll
 *      1 \neg q -> \neg p \mid premise \\
 *      \ll
 *          2 p \mid assumption \\
 *          3 \neg \neg p \mid \neg \neg i 2 \\
 *          4 \neg \neg q \mid MT 1,3 \\
 *      \gg
 *      5 p -> \neg \neg q \mid -> i 2-4
 *  \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class ImpliesIntroRule extends Rule {

    public boolean check(BlockNode beforeBlock,
                         FormulaNode afterFormula) {
        Node beforeFirstFormula = ((LineNode) beforeBlock.getChild(0)).getFormula();
        Node beforeLastFormula = ((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula();

        if (afterFormula.getOperator() != RelationOperator.IMPLICATION) {
            return false;
        }

        //the first parameter of the Implication has to be equals to the first line of the block
        //and second parameter to the last line of the block
        if (equals(beforeFirstFormula, afterFormula.getLeftExpression())
                && equals(beforeLastFormula, afterFormula.getRightExpression())) {
            return true;
        } else {
            return false;
        }
    }
}
