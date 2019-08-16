package com.moses.designpatterns.factory.abstractFactory;

import com.moses.designpatterns.entities.Bus;
import com.moses.designpatterns.entities.Car;

/**
 * 抽象工厂 - 可生产出不同种类的实例
 */
public abstract class AbstractFactory {
    public abstract Car produceCar();
    public abstract Bus produceBus();
}
