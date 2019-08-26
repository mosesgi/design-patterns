package com.moses.designpatterns.interpreter;

public class InterpreterPatternTest {

    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("苏州的老人");
        bus.freeRide("苏州的儿童");
        bus.freeRide("上海的老人");
        bus.freeRide("南京的成人");
        bus.freeRide("南京的儿童");
    }
}
