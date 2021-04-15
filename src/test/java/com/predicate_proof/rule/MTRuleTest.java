package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import org.junit.jupiter.api.Test;

public class MTRuleTest {
    @Test
    public void testCheck() {
        MTRule mtRule = new MTRule();
        BottomNode beforeFormula1 = new BottomNode();
        BottomNode beforeFormula2 = new BottomNode();
        assertFalse(mtRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }

    @Test
    public void testCheck2() {
        MTRule mtRule = new MTRule();
        FormulaNode beforeFormula1 = new FormulaNode();
        BottomNode beforeFormula2 = new BottomNode();
        assertFalse(mtRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }

    @Test
    public void testCheck3() {
        MTRule mtRule = new MTRule();
        BottomNode beforeFormula1 = new BottomNode();
        FormulaNode beforeFormula2 = new FormulaNode();
        assertFalse(mtRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }

    @Test
    public void testCheck4() {
        MTRule mtRule = new MTRule();
        BottomNode beforeFormula1 = new BottomNode();
        BottomNode beforeFormula2 = new BottomNode();
        assertFalse(mtRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }

    @Test
    public void testCheck5() {
        MTRule mtRule = new MTRule();
        FormulaNode beforeFormula1 = new FormulaNode();
        BottomNode beforeFormula2 = new BottomNode();
        assertFalse(mtRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }

    @Test
    public void testCheck6() {
        MTRule mtRule = new MTRule();
        BottomNode beforeFormula1 = new BottomNode();
        FormulaNode beforeFormula2 = new FormulaNode();
        assertFalse(mtRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }
}

