package com.moses.designpatterns.state;

public class Context {
    public static final DoorClosingState DOOR_CLOSING_STATE = new DoorClosingState();
    public static final FaultState FAULT_STATE = new FaultState();
    public static final DoorOpeningState DOOR_OPENING_STATE = new DoorOpeningState();
    public static final MovingState MOVING_STATE = new MovingState();
    public static final StoppingState STOPPING_STATE = new StoppingState();

    private BaseState baseState;

    public BaseState getBaseState() {
        return baseState;
    }

    public void setBaseState(BaseState baseState) {
        this.baseState = baseState;
        baseState.setContext(this);
    }

    public Context move() {
        baseState.move();
        return this;
    }

    public Context stop() {
        baseState.stop();
        return this;
    }

    public Context openDoor() {
        baseState.openDoor();
        return this;
    }

    public Context closeDoor(){
        baseState.closeDoor();
        return this;
    }
}
