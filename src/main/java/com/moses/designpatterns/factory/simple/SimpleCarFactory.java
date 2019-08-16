package com.moses.designpatterns.factory.simple;

import com.moses.designpatterns.entities.Car;
import com.moses.designpatterns.entities.cars.AudiCar;
import com.moses.designpatterns.entities.cars.BMWCar;
import com.moses.designpatterns.entities.cars.BenzCar;

import java.security.InvalidParameterException;

public class SimpleCarFactory {
    public static final String BMW = "BMW";
    public static final String BENZ = "BENZ";
    public static final String AUDI = "AUDI";

    public static Car produceCar(String brand) {
        if (BMW.equals(brand)) {
            return new BMWCar();
        } else if (BENZ.equals(brand)) {
            return new BenzCar();
        } else if (AUDI.equals(brand)) {
            return new AudiCar();
        } else {
            throw new InvalidParameterException("参数有误,无法造车!");
        }
    }

    public static void main(String[] args) {
        Car bmwCar = SimpleCarFactory.produceCar(BMW);
        bmwCar.show();

        Car audiCar = SimpleCarFactory.produceCar(AUDI);
        audiCar.show();
        audiCar.drive();

    }
}
