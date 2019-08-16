package com.moses.designpatterns.factory.abstractFactory;

import com.moses.designpatterns.entities.Bus;
import com.moses.designpatterns.entities.Car;
import com.moses.designpatterns.entities.buses.BenzBus;
import com.moses.designpatterns.entities.cars.BenzCar;

public class BenzFactory extends AbstractFactory {
    @Override
    public Car produceCar() {
        return new BenzCar();
    }

    @Override
    public Bus produceBus() {
        return new BenzBus();
    }
}
