package com.moses.designpatterns.bridge;

public class Bus extends Vehicle {
    public Bus(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("Bus:");
        getEngine().installEngine();
    }
}
