package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.copied.RelationOperator;
import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import org.junit.jupiter.api.Test;

public class AndEliRuleTest {
    @Test
    public void testCheck() {
        AndEliRule andEliRule = new AndEliRule();
        BottomNode beforeFormula = new BottomNode();
        assertFalse(andEliRule.check(true, beforeFormula, new BottomNode()));
    }

    @Test
    public void testCheck2() {
        AndEliRule andEliRule = new AndEliRule();
        FormulaNode beforeFormula = new FormulaNode();
        assertFalse(andEliRule.check(true, beforeFormula, new BottomNode()));
    }

    @Test
    public void testCheck3() {
        AndEliRule andEliRule = new AndEliRule();
        UnaryOperatorNode beforeFormula = new UnaryOperatorNode(RelationOperator.EQ);
        assertFalse(andEliRule.check(true, beforeFormula, new BottomNode()));
    }

    @Test
    public void testCheck4() {
        AndEliRule andEliRule = new AndEliRule();
        FormulaNode beforeFormula = new FormulaNode();
        assertFalse(andEliRule.check(true, beforeFormula, new FormulaNode()));
    }

    @Test
    public void testCheck5() {
        AndEliRule andEliRule = new AndEliRule();
        UnaryOperatorNode beforeFormula = new UnaryOperatorNode(RelationOperator.EQ);
        assertFalse(andEliRule.check(true, beforeFormula, new UnaryOperatorNode(RelationOperator.EQ)));
    }
}

