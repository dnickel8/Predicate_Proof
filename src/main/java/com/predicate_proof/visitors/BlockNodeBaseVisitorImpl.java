package com.predicate_proof.visitors;

import com.predicate_proof.generated.predicate_proof_grammarBaseVisitor;
import com.predicate_proof.generated.predicate_proof_grammarParser.BlockContext;
import com.predicate_proof.generated.predicate_proof_grammarParser.LineContext;
import com.predicate_proof.generated.predicate_proof_grammarParser.LineWithVariableSymbolContext;
import com.predicate_proof.nodes.BlockNode;
import com.predicate_proof.nodes.Node;
import org.antlr.v4.runtime.tree.ParseTree;


public class BlockNodeBaseVisitorImpl extends predicate_proof_grammarBaseVisitor<Node> {

        private LineNodeBaseVisitorImpl lineVisitor = new LineNodeBaseVisitorImpl();

        @Override public Node visitBlock(BlockContext ctx) {
                int lastChildNumber = ctx.getChildCount()-2;
                int firstLine = getFirstLine(ctx.getChild(1));
                int lastLine = getLastLine(ctx.getChild(lastChildNumber));
                BlockNode newNode = new BlockNode(firstLine, lastLine);
                if (ctx.lineWithVariableSymbol() != null) {
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
        
        private int getFirstLine(Object context) {
                int line;
                if (context instanceof LineContext) {
                        line = Integer.parseInt(((LineContext) context).lineNumber().integer().getText());
                } else if (context instanceof LineWithVariableSymbolContext) {
                        line = Integer.parseInt(((LineWithVariableSymbolContext) context).lineNumber().integer().getText());
                } else if(context instanceof BlockContext) {
                        line = getFirstLine(((BlockContext) context).getChild(1));
                } else {
                        line = -1;
                        System.out.println("Fehler in BlockNodeBaseVisitorImpl.getFirstLine");
                }
                return line;
        }

        private int getLastLine(Object context) {
                int line;
                if (context instanceof LineContext) {
                        line = Integer.parseInt(((LineContext) context).lineNumber().integer().getText());
                } else if(context instanceof BlockContext) {
                        line = getFirstLine(((BlockContext) context).getChild(((BlockContext) context).getChildCount()-2));
                } else {
                        line = -1;
                        System.out.println("Fehler in getLastLine");
                }
                return line;
        }

     }
