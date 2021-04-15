package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import org.junit.jupiter.api.Test;

public class NotEliRuleTest {
    @Test
    public void testCheck() {
        NotEliRule notEliRule = new NotEliRule();
        BottomNode beforeFormula1 = new BottomNode();
        BottomNode beforeFormula2 = new BottomNode();
        assertFalse(notEliRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }

    @Test
    public void testCheck2() {
        NotEliRule notEliRule = new NotEliRule();
        UnaryOperatorNode beforeFormula1 = new UnaryOperatorNode();
        BottomNode beforeFormula2 = new BottomNode();
        assertFalse(notEliRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }

    @Test
    public void testCheck3() {
        NotEliRule notEliRule = new NotEliRule();
        BottomNode beforeFormula1 = new BottomNode();
        UnaryOperatorNode beforeFormula2 = new UnaryOperatorNode();
        assertFalse(notEliRule.check(beforeFormula1, beforeFormula2, new BottomNode()));
    }
}

