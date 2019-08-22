package com.moses.designpatterns.entities.fruits;

import com.moses.designpatterns.entities.Fruit;
import com.moses.designpatterns.entities.bags.BananaBag;
import com.moses.designpatterns.visit.Visit;

public class Banana implements Fruit {
    private int price = 60;

    public Banana() {
    }

    public Banana(int price) {
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

    public void pack(BananaBag bag){
        System.out.println("包装香蕉...");
        bag.pack();
    }
}
