package com.moses.designpatterns.state;

public class DoorClosingState extends BaseState {
    @Override
    public void move() {
        context.setBaseState(Context.MOVING_STATE);
        System.out.println("电梯开始移动...");
    }

    @Override
    public void stop() {
        context.setBaseState(Context.STOPPING_STATE);
        System.out.println("电梯停止...");
    }

    @Override
    public void openDoor() {
        context.setBaseState(Context.DOOR_OPENING_STATE);
        System.out.println("电梯开门...");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯门已经关闭, 无需响应");
    }
}
