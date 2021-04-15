package com.predicate_proof.rule;

import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.FormulaNode;
import org.junit.jupiter.api.Test;

public class ImpliesIntroRuleTest {
    @Test
    public void testCheck() {
        // TODO: This test is incomplete.
        //   Reason: No meaningful assertions found.
        //   To help Diffblue Cover to find assertions, please add getters to the
        //   class under test that return fields written by the method under test.
        //   See https://diff.blue/R004

        ImpliesIntroRule impliesIntroRule = new ImpliesIntroRule();
        BlockNode beforeBlock = new BlockNode(2, 2);
        impliesIntroRule.check(beforeBlock, new FormulaNode());
    }
}

