package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import org.junit.jupiter.api.Test;

public class BottomEliRuleTest {
    @Test
    public void testCheck() {
        BottomEliRule bottomEliRule = new BottomEliRule();
        BottomNode beforeNode = new BottomNode();
        assertFalse(bottomEliRule.check(beforeNode, new BottomNode()));
    }

    @Test
    public void testCheck2() {
        BottomEliRule bottomEliRule = new BottomEliRule();
        FormulaNode beforeNode = new FormulaNode();
        assertFalse(bottomEliRule.check(beforeNode, new BottomNode()));
    }

    @Test
    public void testCheck3() {
        BottomEliRule bottomEliRule = new BottomEliRule();
        BottomNode beforeNode = new BottomNode();
        assertTrue(bottomEliRule.check(beforeNode, new FormulaNode()));
    }
}

