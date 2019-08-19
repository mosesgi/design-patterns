package com.moses.designpatterns.builder;

/**
 * 建造器模式
 */
public interface Builder {

    void buildApple(int price);//设置苹果
    void buildBanana(int price);//设置香蕉
    void buildOrange(int price);//设置桔子

    FruitPackage getFruitPackage();//返回创建的套餐
}
