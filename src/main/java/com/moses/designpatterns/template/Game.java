package com.moses.designpatterns.template;

/**
 * 模板模式
 */
public abstract class Game {

    //模板主方法
    public final void play(){
        //初始化游戏
        initialize();
        //开始游戏
        startPlay();
        //结束游戏
        endPlay();
    }

    abstract void initialize();
    abstract void startPlay();
    void endPlay(){
        System.out.println("Game finished - Default");
    };
}
