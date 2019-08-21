package com.moses.designpatterns.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    private String name;

    public Watcher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + ", " + arg);
    }
}
