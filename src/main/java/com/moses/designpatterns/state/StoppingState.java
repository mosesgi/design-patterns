package com.moses.designpatterns.state;

public class StoppingState extends BaseState{
    @Override
    public void move() {
        context.setBaseState(Context.MOVING_STATE);
        System.out.println("电梯开始移动...");
    }

    @Override
    public void stop() {
        System.out.println("电梯已是停止状态,无需响应.");
    }

    @Override
    public void openDoor() {
        context.setBaseState(Context.DOOR_OPENING_STATE);
        System.out.println("电梯开门...");
    }

    @Override
    public void closeDoor() {
        context.setBaseState(Context.DOOR_CLOSING_STATE);
        System.out.println("电梯关门...");
    }
}
