package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import org.junit.jupiter.api.Test;

public class ImpliesEliRuleTest {
    @Test
    public void testCheck() {
        ImpliesEliRule impliesEliRule = new ImpliesEliRule();
        BottomNode beforeFormula1 = new BottomNode();
        BottomNode beforeFormula2 = new BottomNode();
        assertFalse(impliesEliRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }

    @Test
    public void testCheck2() {
        ImpliesEliRule impliesEliRule = new ImpliesEliRule();
        FormulaNode beforeFormula1 = new FormulaNode();
        BottomNode beforeFormula2 = new BottomNode();
        assertFalse(impliesEliRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }

    @Test
    public void testCheck3() {
        ImpliesEliRule impliesEliRule = new ImpliesEliRule();
        BottomNode beforeFormula1 = new BottomNode();
        FormulaNode beforeFormula2 = new FormulaNode();
        assertFalse(impliesEliRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }
}

