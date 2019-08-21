package com.moses.designpatterns.command;

public class UserTest {

    public static void main(String[] args) {
        Television tv = new Television();

        Command turnOnCmd = new TurnOnCommand(tv);
        Command turnOffCmd = new TurnOffCommand(tv);
        Command volumeUpCmd = new VolumeUpCommand(tv);
        Command volumeDownCmd = new VolumeDownCommand(tv);

        RemoteController rc = new RemoteController();
        rc.setTurnOffCommand(turnOffCmd);
        rc.setTurnOnCommand(turnOnCmd);
        rc.setVolumeDownCommand(volumeDownCmd);
        rc.setVolumeUpCommand(volumeUpCmd);

        rc.turnOn();
        rc.volumeUp();
        rc.turnOff();
    }
}
