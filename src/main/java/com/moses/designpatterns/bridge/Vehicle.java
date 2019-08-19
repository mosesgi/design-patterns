package com.moses.designpatterns.bridge;

public abstract class Vehicle {
    private Engine engine;

    public Vehicle(Engine engine){
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public abstract void installEngine();
}
