package com.predicate_proof.visitors;

import com.predicate_proof.generated.predicate_proof_grammarBaseVisitor;
import com.predicate_proof.generated.predicate_proof_grammarParser.BlockContext;
import com.predicate_proof.generated.predicate_proof_grammarParser.LineContext;
import com.predicate_proof.generated.predicate_proof_grammarParser.LineWithVariableSymbolContext;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.Node;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author David Nickel
 * @version 1.0 24/03/2021
 */
public class BlockNodeBaseVisitorImpl extends predicate_proof_grammarBaseVisitor<Node> {

        private LineNodeBaseVisitorImpl lineVisitor = new LineNodeBaseVisitorImpl();

        /**
         *
         * @param ctx is the context of a block
         * @return the BlockNode
         */
        @Override public Node visitBlock(BlockContext ctx) {
                int firstLine = getFirstLine(ctx.getChild(1)); //the first child from ctx (ctx.getChild(0)) i BLOCKBEGIN
                int lastChildNumber = ctx.getChildCount()-2; //the last child from ctx (ctx.getChildCount()-1) is BLOCKEND
                int lastLine = getLastLine(ctx.getChild(lastChildNumber));

                BlockNode newNode = new BlockNode(firstLine, lastLine);
                if (ctx.lineWithVariableSymbol() != null) { //blocks could declare new variables in their fist line, then the first line is with variableSymbol
                        newNode.setDeclaredVariable(ctx.lineWithVariableSymbol().variable().getText());
                        newNode.addChild(lineVisitor.visitLineWithVariableSymbol(ctx.lineWithVariableSymbol()));
                }

                for (int i = 1; i <= lastChildNumber; i++) {
                        ParseTree newChild = ctx.getChild(i);
                        if (newChild instanceof LineContext) {
                                newNode.addChild(lineVisitor.visitLine((LineContext) newChild));
                        } else if (newChild instanceof BlockContext) {
                                newNode.addChild(visitBlock((BlockContext) newChild));
                        }
                }
                return newNode;
        }

        /**
         * search the Linenumber of the first line in a block
         * @param context is the context of the first child of a block
         * @return -1 if there is a failure
         */
        private int getFirstLine(Object context) {
                if (context instanceof LineContext) {
                        return Integer.parseInt(((LineContext) context).lineNumber().integer().getText());
                } else if (context instanceof LineWithVariableSymbolContext) {
                        return Integer.parseInt(((LineWithVariableSymbolContext) context).lineNumber().integer().getText());
                } else if(context instanceof BlockContext) {
                        return getFirstLine(((BlockContext) context).getChild(1));
                } else {
                        System.out.println("Fehler in BlockNodeBaseVisitorImpl.getFirstLine");
                        return -1;
                }
        }

        /**
         * search the Linenumber of the last line in a block
         * @param context is the context of the last child of a block
         * @return -1 if there is a failure
         */
        private int getLastLine(Object context) {
                if (context instanceof LineContext) {
                        return Integer.parseInt(((LineContext) context).lineNumber().integer().getText());
                } else if(context instanceof BlockContext) {
                        return getFirstLine(((BlockContext) context).getChild(((BlockContext) context).getChildCount()-2));
                } else {
                        System.out.println("Fehler in BlockNodeBaseVisitorImpl.getLastLine");
                        return -1;
                }
        }

     }
