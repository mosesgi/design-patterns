package com.moses.designpatterns.observer.jdk;

import java.util.Observable;

public class JdkObserverTest {

    public static void main(String[] args) {
        Subject sub = new Subject();
        sub.addObserver(new Watcher("Killer A"));
        sub.addObserver(new Watcher("Killer B"));
        sub.addObserver(new Watcher("Killer D"));

        sub.action("Please kill John Wick!");
    }
}
