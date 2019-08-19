package com.moses.designpatterns.entities.fruits;

import com.moses.designpatterns.entities.Fruit;
import com.moses.designpatterns.entities.bags.OrangeBag;

public class Orange implements Fruit {
    private int price = 70;

    public Orange(){}

    public Orange(int price){
        this.price = price;
    }

    @Override
    public int price() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void pack(OrangeBag bag){
        System.out.println("包装橙子...");
        bag.pack();
    }
}
