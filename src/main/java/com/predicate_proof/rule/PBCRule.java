package com.predicate_proof.rule;

import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.LineNode;
import com.predicate_proof.nodes.Node;

/**
 *  \ll
 *      1 p \mid premise \\
 *      \ll
 *          2 \neg p \mid assumption \\
 *          3 \bot \mid \neg e 1,2 \\
 *      \gg
 *      4 p \mid PBC \\
 *  \gg
 * @author David Nickel
 * @version 1.0 26/03/2021
 */
public class PBCRule extends Rule {

    public boolean check(BlockNode beforeBlock,
                         Node afterNode) {
        if (!(((LineNode) beforeBlock.getChild(beforeBlock.getChildCount()-1)).getFormula() instanceof BottomNode)) {
            return false;
        } else {
            return negativeEquals(((LineNode) beforeBlock.getChild(0)).getFormula(),
                    afterNode);
        }
    }
}
