package com.moses.designpatterns.entities.cars;

import com.moses.designpatterns.entities.Car;

public class AudiCar implements Car {
    @Override
    public void drive() {
        System.out.println("I'm driving an Audi!!");
    }

    @Override
    public void show() {
        System.out.println("Audi on the way, I stand for authority.");
    }
}
