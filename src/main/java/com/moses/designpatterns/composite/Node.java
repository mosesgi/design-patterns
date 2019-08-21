package com.moses.designpatterns.composite;

import java.util.List;

/**
 * 组合模式
 */
public abstract class Node {
    private String name;

    public Node(String name){
        this.name = name;
    }

    public abstract List<Node> getChildren();

    public String getName(){
        return name;
    }
}
