package com.predicate_proof.nodes;

import java.util.List;

/**
 * @author David Nickel
 */
public class BlockNode extends Node{

    private final int firstLine;
    private final int lastLine;
    private String declaredVariable;

    public BlockNode(List<Node> children, int firstLine, int lastLine) {
        super(children);
        this.firstLine = firstLine;
        this.lastLine = lastLine;
    }

    public BlockNode(int firstLine, int lastLine) {
        this.firstLine = firstLine;
        this.lastLine = lastLine;
    }

    public int getFirstLine() {
        return firstLine;
    }

    public int getLastLine() {
        return lastLine;
    }

    public String getDeclaredVariable() {
        return declaredVariable;
    }

    public void setDeclaredVariable(String declaredVariable) {
        this.declaredVariable = declaredVariable;
    }}
