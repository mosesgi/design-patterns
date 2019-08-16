package com.moses.designpatterns.factory.abstractFactory;

import com.moses.designpatterns.entities.Bus;
import com.moses.designpatterns.entities.Car;

public class TestAbstractFactory {
    public static void main(String[] args) {
        AbstractFactory factory = new AudiFactory();
        Bus audiBus = factory.produceBus();
        Car audiCar = factory.produceCar();

        audiBus.carryPassengers();
        audiCar.drive();

    }
}
