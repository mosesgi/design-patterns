package com.moses.designpatterns.observer;

/**
 * 观察者模式
 */
public class ObserverTest {

    public static void main(String[] args) {
        ISubject subject = new ConcreteSubject();
        subject.addObserver(new ConcreteObserver("Killer A"));
        subject.addObserver(new ConcreteObserver("Killer B"));
        subject.addObserver(new ConcreteObserver("Killer C"));

        subject.notifyObservers();
    }
}
