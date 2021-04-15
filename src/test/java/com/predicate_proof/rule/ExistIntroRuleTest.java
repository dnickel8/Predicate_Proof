package com.predicate_proof.rule;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.predicate_proof.nodes.BottomNode;
import com.predicate_proof.nodes.UnaryOperatorNode;
import org.junit.jupiter.api.Test;

public class ExistIntroRuleTest {
    @Test
    public void testCheck() {
        ExistIntroRule existIntroRule = new ExistIntroRule();
        BottomNode beforeFormula = new BottomNode();
        assertFalse(existIntroRule.check(beforeFormula, new UnaryOperatorNode()));
    }
}

