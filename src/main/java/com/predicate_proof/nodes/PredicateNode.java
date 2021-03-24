package com.predicate_proof.nodes;

import java.util.List;

public class PredicateNode extends Node{

    private String predicateName;
    private List<VariableNode> parameter;

    public PredicateNode(String name, String predicateName) {
        super(name);
        this.predicateName = predicateName;
    }

    public String getPredicateName() {
        return predicateName;
    }

    public void setPredicateName(String predicateName) {
        this.predicateName = predicateName;
    }

    public List<VariableNode> getParameter() {
        return parameter;
    }

    public void setParameter(List<VariableNode> parameter) {
        this.parameter = parameter;
    }

    public VariableNode getParameterByIndex(Integer index) {
        return parameter.get(index);
    }
}
