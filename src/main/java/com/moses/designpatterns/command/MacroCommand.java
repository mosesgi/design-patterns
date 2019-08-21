package com.moses.designpatterns.command;

public interface MacroCommand extends Command {
    void add(Command command);
    void remove(Command command);
}
