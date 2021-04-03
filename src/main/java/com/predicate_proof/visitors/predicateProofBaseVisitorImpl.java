package com.predicate_proof.visitors;

import com.predicate_proof.generated.predicate_proof_grammarBaseVisitor;
import com.predicate_proof.generated.predicate_proof_grammarParser;
import com.predicate_proof.nodes.Node;

/**
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
public class predicateProofBaseVisitorImpl extends predicate_proof_grammarBaseVisitor<Node> {

        private BlockNodeBaseVisitorImpl blockVisitor = new BlockNodeBaseVisitorImpl();

        /**
         * start of the grammar.
         * @param ctx
         * @return
         */
        @Override public Node visitPredicateProof(predicate_proof_grammarParser.PredicateProofContext ctx) {
                return blockVisitor.visitBlock(ctx.block()); }

     }
