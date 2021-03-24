package com.predicate_proof.services;


import com.predicate_proof.generated.predicate_proof_grammarLexer;
import com.predicate_proof.generated.predicate_proof_grammarParser;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.visitors.predicateProofBaseVisitorImpl;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.springframework.stereotype.Service;

@Service
public class PredicateService {

    public boolean logicProofKlausur(String inputString) {

        ANTLRInputStream input = new ANTLRInputStream(inputString);
        predicate_proof_grammarLexer lexer = new predicate_proof_grammarLexer(input);
        lexer.setInputStream((IntStream) input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        predicate_proof_grammarParser parser = new predicate_proof_grammarParser(null);
        parser.setBuildParseTree(true);
        parser.setTokenStream(tokens);

        ParserRuleContext tree = parser.predicateProof();

        predicateProofBaseVisitorImpl visitor = new predicateProofBaseVisitorImpl();
        Node result = visitor.visit(tree);

        System.out.println();

        CheckProof proof = new CheckProof();
        return proof.checkProof((BlockNode) result);
    }
}
