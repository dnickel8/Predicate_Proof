package com.predicate_proof.visitors;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.predicate_proof.generated.predicate_proof_grammarParser;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.Node;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;
import org.junit.jupiter.api.Test;

public class BlockNodeBaseVisitorImplTest {
    @Test
    public void testVisitBlock() {
        BlockNodeBaseVisitorImpl blockNodeBaseVisitorImpl = new BlockNodeBaseVisitorImpl();
        Node actualVisitBlockResult = blockNodeBaseVisitorImpl
                .visitBlock(new predicate_proof_grammarParser.BlockContext(new ParserRuleContext(), 1));
        assertEquals(0, actualVisitBlockResult.getChildCount());
        assertEquals(-1, ((BlockNode) actualVisitBlockResult).getLastLine());
        assertEquals(-1, ((BlockNode) actualVisitBlockResult).getFirstLine());
    }

    @Test
    public void testVisitBlock2() {
        BlockNodeBaseVisitorImpl blockNodeBaseVisitorImpl = new BlockNodeBaseVisitorImpl();

        predicate_proof_grammarParser.BlockContext blockContext = new predicate_proof_grammarParser.BlockContext(
                new ParserRuleContext(), 1);
        blockContext.addChild(new ErrorNodeImpl(new CommonToken(1)));
        Node actualVisitBlockResult = blockNodeBaseVisitorImpl.visitBlock(blockContext);
        assertEquals(0, actualVisitBlockResult.getChildCount());
        assertEquals(-1, ((BlockNode) actualVisitBlockResult).getLastLine());
        assertEquals(-1, ((BlockNode) actualVisitBlockResult).getFirstLine());
    }

    @Test
    public void testVisitBlock3() {
        BlockNodeBaseVisitorImpl blockNodeBaseVisitorImpl = new BlockNodeBaseVisitorImpl();

        predicate_proof_grammarParser.BlockContext blockContext = new predicate_proof_grammarParser.BlockContext(
                new ParserRuleContext(), 1);
        blockContext.addChild(new ErrorNodeImpl(new CommonToken(1)));
        blockContext.addChild(new ErrorNodeImpl(new CommonToken(1)));
        blockContext.addChild(new ErrorNodeImpl(new CommonToken(1)));
        Node actualVisitBlockResult = blockNodeBaseVisitorImpl.visitBlock(blockContext);
        assertEquals(0, actualVisitBlockResult.getChildCount());
        assertEquals(-1, ((BlockNode) actualVisitBlockResult).getLastLine());
        assertEquals(-1, ((BlockNode) actualVisitBlockResult).getFirstLine());
    }
}

