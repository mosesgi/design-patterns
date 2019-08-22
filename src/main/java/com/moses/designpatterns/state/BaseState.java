package com.moses.designpatterns.state;

public abstract class BaseState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 电梯上下移动
     */
    public abstract void move();

    /**
     * 电梯停在某楼层
     */
    public abstract void stop();

    /**
     * 电梯开门
     */
    public abstract void openDoor();

    /**
     * 电梯关门
     */
    public abstract void closeDoor();
}
