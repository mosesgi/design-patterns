package com.moses.designpatterns.command;

public class RemoteController {

    private Command turnOnCommand;
    private Command turnOffCommand;
    private Command volumeUpCommand;
    private Command volumeDownCommand;

    public void setTurnOnCommand(Command turnOnCommand) {
        this.turnOnCommand = turnOnCommand;
    }

    public void setTurnOffCommand(Command turnOffCommand) {
        this.turnOffCommand = turnOffCommand;
    }

    public void setVolumeUpCommand(Command volumeUpCommand) {
        this.volumeUpCommand = volumeUpCommand;
    }

    public void setVolumeDownCommand(Command volumeDownCommand) {
        this.volumeDownCommand = volumeDownCommand;
    }

    public void turnOn(){
        turnOnCommand.execute();
    }

    public void turnOff(){
        turnOffCommand.execute();
    }

    public void volumeUp(){
        volumeUpCommand.execute();
    }

    public void volumeDown(){
        volumeDownCommand.execute();
    }
}
