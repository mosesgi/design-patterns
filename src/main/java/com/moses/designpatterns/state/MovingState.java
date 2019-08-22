package com.moses.designpatterns.state;

public class MovingState extends BaseState{

    @Override
    public void move() {
        System.out.println("已经在移动中了,无需响应.");
    }

    @Override
    public void stop() {
        context.setBaseState(Context.STOPPING_STATE);
        System.out.println("电梯停止");
    }

    @Override
    public void openDoor() {
        context.setBaseState(Context.FAULT_STATE);
        System.out.println("移动时开门, 发生故障!");
    }

    @Override
    public void closeDoor() {
        System.out.println("电梯门已是关闭状态, 无需响应.");
    }
}
