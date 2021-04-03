package com.predicate_proof.rule;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.*;

/**
 *  \ll
 *      1 p \mid premise \\
 *      \ll
 *          2 \neg p \mid assumption \\
 *          3 bot \mid \neg e 1,2 \\
 *      \gg
 *      4 \neg \neg p \mid \neg i 2-3 \\
 *  \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class NotIntroRule extends Rule {

    public boolean check(BlockNode beforeBlock,
                         UnaryOperatorNode afterNode) {

        if (afterNode.getOperator() != RelationOperator.NOT) {
            return false;
        }

        Node beforeBlockFirst = ((LineNode) beforeBlock.getChild(0)).getFormula();
        Node beforeBlockLast = ((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula();

        if (beforeBlockLast instanceof BottomNode) {
            return equals(beforeBlockFirst, afterNode.getExpression());
        } else {
            return false;
        }
    }
}
