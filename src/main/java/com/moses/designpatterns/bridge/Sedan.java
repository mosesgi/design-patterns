package com.moses.designpatterns.bridge;

public class Sedan extends Vehicle {

    public Sedan(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("Sedan:");
        this.getEngine().installEngine();
    }
}
