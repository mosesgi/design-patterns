package com.moses.designpatterns.prototype;

public class ProtoTest {

    public static void main(String[] args) {
        SimplePrototype sp = new SimplePrototype();
        sp.setAge(20);
        SimplePrototype copy;

        try {
            copy = (SimplePrototype)sp.clone();
            System.out.println(copy.getAge());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
