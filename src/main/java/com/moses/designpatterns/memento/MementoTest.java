package com.moses.designpatterns.memento;

public class MementoTest {

    public static void main(String[] args) {
        CallOfDuty cod = new CallOfDuty();
        cod.play();

        Caretaker caretaker = new Caretaker();
        caretaker.archive(cod.createMemento());
        cod.quit();

        CallOfDuty cod1 = new CallOfDuty();
        cod1.restore(caretaker.getMemento());
    }
}
