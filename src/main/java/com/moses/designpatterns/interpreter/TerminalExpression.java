package com.moses.designpatterns.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式类
 */
public class TerminalExpression implements Expression {
    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data){
        for(int i=0; i<data.length; i++){
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
