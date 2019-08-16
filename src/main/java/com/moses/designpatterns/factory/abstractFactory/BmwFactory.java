package com.moses.designpatterns.factory.abstractFactory;

import com.moses.designpatterns.entities.Bus;
import com.moses.designpatterns.entities.Car;
import com.moses.designpatterns.entities.buses.BmwBus;
import com.moses.designpatterns.entities.cars.BMWCar;

public class BmwFactory extends AbstractFactory {
    @Override
    public Car produceCar() {
        return new BMWCar();
    }

    @Override
    public Bus produceBus() {
        return new BmwBus();
    }
}
