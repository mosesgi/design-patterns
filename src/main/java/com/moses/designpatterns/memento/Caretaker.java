package com.moses.designpatterns.memento;

/**
 * 负责管理Memento
 */
public class Caretaker {
    Memento memento;

    public void archive(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return memento;
    }
}
