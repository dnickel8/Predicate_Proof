package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.LineNode;
import com.predicate_proof.nodes.Node;

/**
 *  \ll
 *      1 p \vee q \mid premise \\
 *      \ll
 *          2 p \mid assumption \\
 *          3 q \vee p \mid \vee i2 2 \\
 *      \gg
 *      \ll
 *          4 q \mid assumption \\
 *          5 q \vee p \mid \vee i1 4 \\
 *      \gg
 *      6 q \vee p \mid \vee e 1,2-3,4-5 \\
 *  \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class OrEliRule extends Rule {

    public boolean check(FormulaNode beforeFormula,
                         BlockNode beforeBlock1,
                         BlockNode beforeBlock2,
                         Node afterFormula) {

        if (beforeFormula.getOperator() != RelationOperator.OR) {
            return false;
        }

        Node block1firstFormula = ((LineNode) beforeBlock1.getChild(0)).getFormula();
        Node block2firstFormula = ((LineNode) beforeBlock2.getChild(0)).getFormula();
        Node block1LastFormula = ((LineNode) beforeBlock1.getChild(beforeBlock1.getChildCount()-1)).getFormula();
        Node block2LastFormula = ((LineNode) beforeBlock2.getChild(beforeBlock2.getChildCount()-1)).getFormula();

        if (equals(block1LastFormula,block2LastFormula, afterFormula)) {
            //there are two possibilities for the order in the or-statement,
            // both will be checked.
            if (equals(block1firstFormula, beforeFormula.getLeftExpression())
                    && equals(block2firstFormula, beforeFormula.getRightExpression())) {
                return true;
            } else if (equals(block1firstFormula, beforeFormula.getRightExpression())
                    && equals(block2firstFormula, beforeFormula.getLeftExpression())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
