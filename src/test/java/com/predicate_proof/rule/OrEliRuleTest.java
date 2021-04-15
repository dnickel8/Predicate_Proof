package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import org.junit.jupiter.api.Test;

public class OrEliRuleTest {
    @Test
    public void testCheck() {
        OrEliRule orEliRule = new OrEliRule();
        FormulaNode beforeFormula = new FormulaNode();
        BlockNode beforeBlock1 = new BlockNode(2, 2);
        BlockNode beforeBlock2 = new BlockNode(2, 2);
        assertFalse(orEliRule.check(beforeFormula, beforeBlock1, beforeBlock2, new BottomNode()));
    }
}

