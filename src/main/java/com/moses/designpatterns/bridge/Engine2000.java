package com.moses.designpatterns.bridge;

public class Engine2000 implements Engine {
    @Override
    public void installEngine() {
        System.out.println("安装2000CC发动引擎");
    }
}
