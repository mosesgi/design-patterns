package com.moses.designpatterns.bridge;

/**
 * 桥接模式
 */
public class BridgeClient {
    public static void main(String[] args) {
        Engine e2k = new Engine2000();
        Engine e2k2 = new Engine2200();

        Vehicle sedan = new Sedan(e2k);
        sedan.installEngine();

        Vehicle bus = new Bus(e2k2);
        bus.installEngine();
    }
}
