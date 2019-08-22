package com.moses.designpatterns.state;

public class DoorOpeningState extends BaseState {
    @Override
    public void move() {
        context.setBaseState(Context.FAULT_STATE);
        System.out.println("电梯开门状态下移动, 发生故障!");
    }

    @Override
    public void stop() {
        System.out.println("电梯开门中, 已经停止移动, 无需响应");
    }

    @Override
    public void openDoor() {
        System.out.println("电梯已在开门中, 无需响应");
    }

    @Override
    public void closeDoor() {
        context.setBaseState(Context.DOOR_CLOSING_STATE);
        System.out.println("电梯关门...");
    }
}
