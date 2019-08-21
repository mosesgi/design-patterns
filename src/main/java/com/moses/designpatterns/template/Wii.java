package com.moses.designpatterns.template;

public class Wii extends Game {
    @Override
    void initialize() {
        System.out.println("Turn on Wii machine.");
    }

    @Override
    void startPlay() {
        System.out.println("Wii started, enjoy the games!");
    }

    @Override
    void endPlay() {
        System.out.println("Game finished, turn off Wii machine.");
    }
}
