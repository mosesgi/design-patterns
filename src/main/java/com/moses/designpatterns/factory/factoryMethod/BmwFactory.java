package com.moses.designpatterns.factory.factoryMethod;

import com.moses.designpatterns.entities.Car;
import com.moses.designpatterns.entities.cars.BMWCar;

public class BmwFactory extends AbsFactory {
    @Override
    public Car produceCar() {
        return new BMWCar();
    }
}
