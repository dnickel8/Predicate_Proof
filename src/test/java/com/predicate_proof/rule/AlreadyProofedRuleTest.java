package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import org.junit.jupiter.api.Test;

public class AlreadyProofedRuleTest {
    @Test
    public void testCheck() {
        AlreadyProofedRule alreadyProofedRule = new AlreadyProofedRule();
        BottomNode beforeNode = new BottomNode();
        assertFalse(alreadyProofedRule.check(beforeNode, new BottomNode()));
    }

    @Test
    public void testCheck2() {
        AlreadyProofedRule alreadyProofedRule = new AlreadyProofedRule();
        FormulaNode beforeNode = new FormulaNode();
        assertFalse(alreadyProofedRule.check(beforeNode, new BottomNode()));
    }

    @Test
    public void testCheck3() {
        AlreadyProofedRule alreadyProofedRule = new AlreadyProofedRule();
        FormulaNode beforeNode = new FormulaNode();
        assertFalse(alreadyProofedRule.check(beforeNode, new FormulaNode()));
    }
}

