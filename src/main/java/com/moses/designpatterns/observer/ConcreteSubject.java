package com.moses.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements ISubject {
    private List<IObserver> list = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : list){
            observer.update();
        }
    }
}
