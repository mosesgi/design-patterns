package com.moses.designpatterns.command;

/**
 * 宏命令
 */
public class MacroTest {

    public static void main(String[] args) {
        Television tv = new Television();

        Command turnOnCmd = new TurnOnCommand(tv);
        Command turnOffCmd = new TurnOffCommand(tv);
        Command volumeUpCmd = new VolumeUpCommand(tv);
        Command volumeDownCmd = new VolumeDownCommand(tv);

        MacroTvCommand macroCmd = new MacroTvCommand();
        macroCmd.add(turnOnCmd);
        macroCmd.add(volumeUpCmd);
        macroCmd.add(turnOffCmd);

        macroCmd.execute();
    }
}
