package com.predicate_proof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PredicateProofApplication {

	public static void main(String[] args) {
		SpringApplication.run(PredicateProofApplication.class, args);
	}

	/*public static void niam(){
		//String input_file = "src/Beispiel";
		//System.out.println(proof(input_file));
		System.out.println(proof("src/testFiles/andRulesSeite7"));
		System.out.println(proof("src/testFiles/1.5_DoubleNegation"));
		System.out.println(proof("src/testFiles/1.6DoubleNegation"));
		System.out.println(proof("src/testFiles/ImplicationEliSeite9"));
		System.out.println(proof("src/testFiles/ImplicationEliSeite10"));
		System.out.println(proof("src/testFiles/1.7_ImplicationEli"));
		System.out.println(proof("src/testFiles/1.8_MTandDoubleNotEli"));
		System.out.println(proof("src/testFiles/1.8_MTandDoubleNotIntro"));
		System.out.println(proof("src/testFiles/ImplicationIntroSeite11"));
		System.out.println(proof("src/testFiles/1.9_implicationIntro"));
		System.out.println(proof("src/testFiles/1.11_"));
		System.out.println(proof("src/testFiles/1.13_AndIntro"));
		System.out.println(proof("src/testFiles/1.14_AndEli"));
		System.out.println(proof("src/testFiles/1.15_"));
		System.out.println(proof("src/testFiles/1.16_"));
		System.out.println(proof("src/testFiles/1.17_"));
		System.out.println(proof("src/testFiles/1.18_"));
		System.out.println(proof("src/testFiles/1.20_"));
		System.out.println(proof("src/testFiles/1.21_1"));
		System.out.println(proof("src/testFiles/1.21_2"));
		System.out.println(proof("src/testFiles/1.22_"));
		System.out.println(proof("src/testFiles/1.23_"));
		System.out.println(proof("src/testFiles/1.24_LEM"));
		System.out.println(proof("src/testFiles/predicate/Seite111_1"));
		System.out.println(proof("src/testFiles/predicate/Seite111_2"));
		System.out.println(proof("src/testFiles/predicate/Seite114_1"));
		//System.out.println(proof("src/testFiles/predicate/Seite114_2")); //false
		System.out.println(proof("src/testFiles/predicate/Seite115_"));
		System.out.println(proof("src/testFiles/predicate/Seite116_1"));
		System.out.println(proof("src/testFiles/predicate/Seite116_2"));

	}


	private static boolean proof(String filePath) {

		ANTLRInputStream input = null;
		input = new ANTLRInputStream(ladeDatei(filePath));
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
	}*/
}
