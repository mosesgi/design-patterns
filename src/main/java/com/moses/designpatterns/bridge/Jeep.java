package com.moses.designpatterns.bridge;

public class Jeep extends Vehicle {
    public Jeep(Engine engine) {
        super(engine);
    }

    @Override
    public void installEngine() {
        System.out.print("Jeep:");
        this.getEngine().installEngine();
    }
}
