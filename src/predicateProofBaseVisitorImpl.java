import generated.predicate_proof_grammarBaseVisitor;
import generated.predicate_proof_grammarParser;
import nodes.Node;
import visitors.BlockNodeBaseVisitorImpl;


public class predicateProofBaseVisitorImpl extends predicate_proof_grammarBaseVisitor<Node> {

        private BlockNodeBaseVisitorImpl blockVisitor = new BlockNodeBaseVisitorImpl();

        @Override public Node visitPredicateProof(predicate_proof_grammarParser.PredicateProofContext ctx) {
                return blockVisitor.visitBlock(ctx.block()); }







        @Override public Node visitVariable(predicate_proof_grammarParser.VariableContext ctx) { return visitChildren(ctx); }

        @Override public Node visitSingleScope(predicate_proof_grammarParser.SingleScopeContext ctx) { return visitChildren(ctx); }

        @Override public Node visitMultiScope(predicate_proof_grammarParser.MultiScopeContext ctx) { return visitChildren(ctx); }

        @Override public Node visitLineNumber(predicate_proof_grammarParser.LineNumberContext ctx) {
                return visitChildren(ctx);
        }

        @Override public Node visitInteger(predicate_proof_grammarParser.IntegerContext ctx) { return visitChildren(ctx); }

     }
