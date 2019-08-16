package com.moses.designpatterns.factory.factoryMethod;

import com.moses.designpatterns.entities.Car;
import com.moses.designpatterns.entities.cars.AudiCar;

public class AudiFactory extends AbsFactory {
    @Override
    public Car produceCar() {
        return new AudiCar();
    }
}
