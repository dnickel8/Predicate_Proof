package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import org.junit.jupiter.api.Test;

public class LEMRuleTest {
    @Test
    public void testCheck() {
        LEMRule lemRule = new LEMRule();
        assertFalse(lemRule.check(new FormulaNode()));
    }

    @Test
    public void testCheck2() {
        LEMRule lemRule = new LEMRule();
        BottomNode leftExpression = new BottomNode();
        assertFalse(lemRule.check(new FormulaNode(RelationOperator.EQ, leftExpression, new BottomNode())));
    }

    @Test
    public void testCheck3() {
        LEMRule lemRule = new LEMRule();
        BottomNode leftExpression = new BottomNode();
        assertFalse(lemRule.check(new FormulaNode(RelationOperator.OR, leftExpression, new BottomNode())));
    }

    @Test
    public void testCheck4() {
        LEMRule lemRule = new LEMRule();
        BottomNode beforeNode = new BottomNode();
        assertFalse(lemRule.check(beforeNode, new FormulaNode()));
    }

    @Test
    public void testCheck5() {
        LEMRule lemRule = new LEMRule();
        assertFalse(lemRule.check(null, new FormulaNode()));
    }

    @Test
    public void testCheck6() {
        LEMRule lemRule = new LEMRule();
        FormulaNode beforeNode = new FormulaNode();
        assertFalse(lemRule.check(beforeNode, new FormulaNode()));
    }

    @Test
    public void testCheck7() {
        LEMRule lemRule = new LEMRule();
        assertFalse(lemRule.check(new FormulaNode(), null));
    }
}

