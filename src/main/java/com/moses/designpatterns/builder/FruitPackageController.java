package com.moses.designpatterns.builder;

/**
 * 建造器模式
 */
public class FruitPackageController {

    public void construct(){
        Builder build = new MemberBuilder();
        build.buildApple(110);
        build.buildBanana(80);
        build.buildOrange(30);

        FruitPackage pack = build.getFruitPackage();

        int cost = pack.cost();
        System.out.println("套餐花费: " + cost);
    }

    public static void main(String[] args) {
        new FruitPackageController().construct();
    }
}
