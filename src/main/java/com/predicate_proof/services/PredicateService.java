package com.predicate_proof.services;

import com.predicate_proof.generated.predicate_proof_grammarLexer;
import com.predicate_proof.generated.predicate_proof_grammarParser;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.Node;
import com.predicate_proof.visitors.predicateProofBaseVisitorImpl;
import org.antlr.v4.runtime.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author David Nickel
 * @version 1.0, 24/03/2021
 */
@Service
public class PredicateService {


    public boolean logicProofKlausur(String inputString) {

        CharStream charStream = CharStreams.fromString(inputString);
        predicate_proof_grammarLexer lexer = new predicate_proof_grammarLexer(charStream);
        lexer.setInputStream(charStream);

        CommonTokenStream tokens = new CommonTokenStream(lexer); //Constructs a new CommonTokenStream using the specified token source
        tokens.fill(); //get all tokens from lexer until EOF

        predicate_proof_grammarParser parser = new predicate_proof_grammarParser(null);
        parser.setBuildParseTree(true);
        parser.setTokenStream(tokens);

        //builds the parse-tree
        ParserRuleContext tree = parser.predicateProof();

        //builds the AST from the parse-tree
        Node result = new predicateProofBaseVisitorImpl().visit(tree);

        //check if the proof is valid
        return new CheckProof().checkProof((BlockNode) result);
    }
}
