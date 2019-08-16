package com.moses.designpatterns.entities.cars;

import com.moses.designpatterns.entities.Car;

public class BMWCar implements Car {

    @Override
    public void drive() {
        System.out.println("I'm driving a BMW!!");
    }

    @Override
    public void show() {
        System.out.println("Look at me, BMW, blue & white.");
    }
}
