package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import org.junit.jupiter.api.Test;

public class AndIntroRuleTest {
    @Test
    public void testCheck() {
        AndIntroRule andIntroRule = new AndIntroRule();
        BottomNode beforeFormula1 = new BottomNode();
        BottomNode beforeFormula2 = new BottomNode();
        assertFalse(andIntroRule.check(beforeFormula1, beforeFormula2, new FormulaNode()));
    }
}

