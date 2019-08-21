package com.moses.designpatterns.command;

public class Television {
    public void turnOn(){
        System.out.println("Turn on the TV");
    }

    public void volumeUp(){
        System.out.println("Turn the volume up...");
    }

    public void volumeDown(){
        System.out.println("Turn the volume down...");
    }

    public void turnOff(){
        System.out.println("Turn off the TV");
    }
}
