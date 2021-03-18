import generated.predicate_proof_grammarLexer;
import generated.predicate_proof_grammarParser;
import nodes.BlockNode;
import nodes.Node;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {


        //String input_file = "src/Beispiel";
        //System.out.println(krassMethod(input_file));
        //System.out.println(krassMethod("src/testFiles/andRulesSeite7"));
        //System.out.println(krassMethod("src/testFiles/1.5_DoubleNegation"));
        //System.out.println(krassMethod("src/testFiles/1.6DoubleNegation"));
        //System.out.println(krassMethod("src/testFiles/ImplicationEliSeite9"));
        //System.out.println(krassMethod("src/testFiles/ImplicationEliSeite10"));
        //System.out.println(krassMethod("src/testFiles/1.7_ImplicationEli"));
        //System.out.println(krassMethod("src/testFiles/1.8_MTandDoubleNotEli"));
        //System.out.println(krassMethod("src/testFiles/1.8_MTandDoubleNotIntro"));
        //System.out.println(krassMethod("src/testFiles/ImplicationIntroSeite11"));
        //System.out.println(krassMethod("src/testFiles/1.9_implicationIntro"));
        //System.out.println(krassMethod("src/testFiles/1.11_"));
        //System.out.println(krassMethod("src/testFiles/1.13_AndIntro"));
        //System.out.println(krassMethod("src/testFiles/1.14_AndEli"));
        //System.out.println(krassMethod("src/testFiles/1.15_"));
        //System.out.println(krassMethod("src/testFiles/1.16_"));
        //System.out.println(krassMethod("src/testFiles/1.17_"));
        //System.out.println(krassMethod("src/testFiles/1.18_"));
        System.out.println(krassMethod("src/testFiles/1.20_"));
    }

    private static boolean krassMethod(String filePath) {

        ANTLRInputStream input = new ANTLRInputStream(ladeDatei(filePath));
        predicate_proof_grammarLexer lexer = new predicate_proof_grammarLexer(input);
        lexer.setInputStream(input);

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

    private static String ladeDatei(String datName) {

        File file = new File(datName);
        String return_string = "";

        if (!file.canRead() || !file.isFile())
            System.exit(0);

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(datName));
            String zeile = null;

            while ((zeile = in.readLine()) != null) {
                return_string = return_string + zeile;
            }
            System.out.println(return_string);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null)
                try {
                    in.close();
                } catch (IOException e) {
                }
        }
        return return_string;
    }
}