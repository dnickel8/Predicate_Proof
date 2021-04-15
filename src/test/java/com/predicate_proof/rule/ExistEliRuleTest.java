package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import org.junit.jupiter.api.Test;

public class ExistEliRuleTest {
    @Test
    public void testCheck() {
        ExistEliRule existEliRule = new ExistEliRule();
        UnaryOperatorNode beforeFormula = new UnaryOperatorNode();
        BlockNode beforeBlock = new BlockNode(2, 2);
        assertFalse(existEliRule.check(beforeFormula, beforeBlock, new BottomNode()));
    }
}

