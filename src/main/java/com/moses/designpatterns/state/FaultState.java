package com.moses.designpatterns.state;

public class FaultState extends BaseState{
    private String msg = "电梯发生故障,不能工作!";

    @Override
    public void move() {
        System.out.println(msg);
    }

    @Override
    public void stop() {
        System.out.println(msg);
    }

    @Override
    public void openDoor() {
        System.out.println(msg);
    }

    @Override
    public void closeDoor() {
        System.out.println(msg);
    }
}
