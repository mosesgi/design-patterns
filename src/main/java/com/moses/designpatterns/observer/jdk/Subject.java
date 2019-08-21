package com.moses.designpatterns.observer.jdk;

import java.util.Observable;

public class Subject extends Observable {
    public void action(String content){
        this.setChanged();
        this.notifyObservers(content);
    }
}
