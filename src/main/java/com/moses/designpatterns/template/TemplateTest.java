package com.moses.designpatterns.template;

public class TemplateTest {

    public static void main(String[] args) {
        Game game = new Football();
        game.play();

        System.out.println();

        game = new Wii();
        game.play();
    }
}
