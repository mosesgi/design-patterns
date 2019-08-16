package com.moses.designpatterns.factory.abstractFactory;

import com.moses.designpatterns.entities.Bus;
import com.moses.designpatterns.entities.Car;
import com.moses.designpatterns.entities.buses.AudiBus;
import com.moses.designpatterns.entities.cars.AudiCar;

public class AudiFactory extends AbstractFactory {
    @Override
    public Car produceCar() {
        return new AudiCar();
    }

    @Override
    public Bus produceBus() {
        return new AudiBus();
    }
}
