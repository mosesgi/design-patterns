package com.moses.designpatterns.state;

public class StateTest {

    public static void main(String[] args) {
        Context context = new Context();
        context.setBaseState(new DoorClosingState());
        context.move().openDoor().closeDoor();

        context = new Context();
        context.setBaseState(new MovingState());
        context.stop().openDoor().move().openDoor();
    }
}
