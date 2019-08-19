package com.moses.designpatterns.entities.fruits;

import com.moses.designpatterns.entities.Fruit;
import com.moses.designpatterns.entities.bags.AppleBag;

public class Apple implements Fruit {
    private int price = 100;

    public Apple(){}
    public Apple(int price){
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void pack(AppleBag bag){
        System.out.println("包装苹果...");
        bag.pack();
    }
}
