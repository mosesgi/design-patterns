package com.moses.designpatterns.entities.fruits;

import com.moses.designpatterns.entities.Fruit;
import com.moses.designpatterns.entities.bags.AppleBag;
import com.moses.designpatterns.visit.Visit;

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

    @Override
    public int accept(Visit visit) {
        return visit.sell(this);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void pack(AppleBag bag){
        System.out.println("包装苹果...");
        bag.pack();
    }
}
