package com.moses.designpatterns.factory.factoryMethod;

import com.moses.designpatterns.entities.Car;

/**
 * 工厂方法模式 - 只生产同种类型的实例
 */
public abstract class AbsFactory {
    public abstract Car produceCar();

    public void driving(){
        System.out.println("AbsFactory method driving...");
        produceCar().drive();
    }
}
