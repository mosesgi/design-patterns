package com.moses.designpatterns.facade;

/**
 * 门面模式/外观模式
 */
public class Facade {
    private AirConditioner ac;
    private Light light;
    private TV tv;

    public Facade(){
        ac = new AirConditioner();
        light = new Light();
        tv = new TV();
    }

    public void homeMode(){
        System.out.println("Coming home!");
        ac.turnOn();
        light.turnOn();
        tv.turnOn();
    }
}
