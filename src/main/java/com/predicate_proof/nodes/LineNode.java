package com.predicate_proof.nodes;

import java.util.List;

public class LineNode extends Node{

    private int linenumber;
    private Node rule;
    private Node formula;
    private boolean withVariableSymbol = false;
    private String variableSymbol;


    public LineNode(List<Node> child, String name) {
        super(child, name);
    }

    public LineNode(String name, int linenumber) {
        super(name);
        this.linenumber = linenumber;

    }

    public LineNode(String name, int linenumber, boolean withVariableSymbol, String variableSymbol) {
        super(name);
        this.linenumber = linenumber;
        this.withVariableSymbol = withVariableSymbol;
        this.variableSymbol = variableSymbol;
    }

    public int getLinenumber() {
        return linenumber;
    }

    public void setLinenumber(int linenumber) {
        this.linenumber = linenumber;
    }

    public Node getRule() {
        return rule;
    }

    public void setRule(RuleNode rule) {
        this.rule = rule;
    }

    public Node getFormula() {
        return formula;
    }

    public void setFormula(Node formula) {
        this.formula = formula;
    }

    public void setRule(Node rule) {
        this.rule = rule;
    }

    public boolean isWithVariableSymbol() {
        return withVariableSymbol;
    }

    public void setWithVariableSymbol(boolean withVariableSymbol) {
        this.withVariableSymbol = withVariableSymbol;
    }

    public String getVariableSymbol() {
        return variableSymbol;
    }

    public void setVariableSymbol(String variableSymbol) {
        this.variableSymbol = variableSymbol;
    }
}
