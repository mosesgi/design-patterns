package com.moses.designpatterns.mediator;

public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 与中介者联系,传达给房东
     * @param message
     */
    public void contact(String message){
        mediator.contact(message, this);
    }

    public void getMessage(String message){
        System.out.println("租房者 name " + " 获取信息: " + message);
    }
}
