package com.moses.designpatterns.builder;

import com.moses.designpatterns.entities.fruits.Apple;
import com.moses.designpatterns.entities.fruits.Banana;
import com.moses.designpatterns.entities.fruits.Orange;

public class MemberBuilder implements Builder {
    private FruitPackage fruitMeal = new FruitPackage();

    @Override
    public void buildApple(int price) {
        Apple apple = new Apple();
        apple.setPrice(price);
        fruitMeal.setApple(apple);
    }

    @Override
    public void buildBanana(int price) {
        Banana fruit = new Banana();
        fruit.setPrice(price);
        fruitMeal.setBanana(fruit);
    }

    @Override
    public void buildOrange(int price) {
        Orange fruit = new Orange();
        fruit.setPrice(price);
        fruitMeal.setOrange(fruit);
    }

    @Override
    public FruitPackage getFruitPackage() {
        fruitMeal.setDiscount(10);
        fruitMeal.init();
        return fruitMeal;
    }
}
