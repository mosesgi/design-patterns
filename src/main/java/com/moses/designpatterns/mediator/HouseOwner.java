package com.moses.designpatterns.mediator;

public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 与中介联系, 传达给房客
     * @param message
     */
    public void contact(String message){
        mediator.contact(message, this);
    }

    public void getMessage(String message){
        System.out.println("房主 " + name + " 获得消息: " + message);
    }
}
