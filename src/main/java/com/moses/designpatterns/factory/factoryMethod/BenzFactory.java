package com.moses.designpatterns.factory.factoryMethod;

import com.moses.designpatterns.entities.Car;
import com.moses.designpatterns.entities.cars.BenzCar;

public class BenzFactory extends AbsFactory {
    @Override
    public Car produceCar() {
        return new BenzCar();
    }
}
