package com.predicate_proof.nodes;

import java.util.ArrayList;
import java.util.List;

public abstract class Node {

    private List<Node> children = new ArrayList<>();
    private String name;

    public Node(List<Node> children, String name) {
        this.children = children;
        this.name = name;
    }

    public Node() {

    }

    public Node(String name) {
        this.name = name;
    }


    public void addChild(Node child){
        this.children.add(child);
    };

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public Node getChild(int number) {
        return children.get(number);
    }

    public int getChildCount() {
        return children.size();
    }
}
