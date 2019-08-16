package com.moses.designpatterns.factory.factoryMethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        AbsFactory factory = new BmwFactory();
        factory.driving();

        factory = new AudiFactory();
        factory.driving();
    }
}
