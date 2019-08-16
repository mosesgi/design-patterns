package com.moses.designpatterns.entities.cars;

import com.moses.designpatterns.entities.Car;

public class BenzCar implements Car {
    @Override
    public void drive() {
        System.out.println("I'm driving BENZ!!");
    }

    @Override
    public void show() {
        System.out.println("BENZ, I'm ancestor of all cars!");
    }
}
