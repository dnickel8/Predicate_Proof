package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.FormulaNode;
import org.junit.jupiter.api.Test;

public class OrIntroRuleTest {
    @Test
    public void testCheck() {
        OrIntroRule orIntroRule = new OrIntroRule();
        BottomNode beforeFormula = new BottomNode();
        assertFalse(orIntroRule.check(true, beforeFormula, new FormulaNode()));
    }
}

