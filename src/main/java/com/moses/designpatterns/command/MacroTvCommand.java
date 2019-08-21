package com.moses.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class MacroTvCommand implements MacroCommand {
    private List<Command> list = new ArrayList<>();

    @Override
    public void add(Command command) {
        list.add(command);
    }

    @Override
    public void remove(Command command) {
        list.remove(command);
    }

    @Override
    public void execute() {
        System.out.println("----------自动回放保存的命令----------");
        for(Command cmd : list){
            cmd.execute();
        }
        System.out.println("----------宏命令集回话完成------------");
    }
}
