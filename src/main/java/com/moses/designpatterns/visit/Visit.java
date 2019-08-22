package com.moses.designpatterns.visit;

import com.moses.designpatterns.entities.Fruit;
import com.moses.designpatterns.entities.fruits.Apple;
import com.moses.designpatterns.entities.fruits.Banana;
import com.moses.designpatterns.entities.fruits.Orange;

public class Visit {
    //苹果计价
    public int sell(Apple apple){
        System.out.println("apple's price: ￥50");
        return 50;
    }

    //桔子计价
    public int sell(Orange orange){
        System.out.println("orange's price: ￥20");
        return 20;
    }

    //香蕉计价
    public int sell(Banana banana){
        System.out.println("banana's price: ￥30");
        return 30;
    }

    //其它水果计价
    public int sell(Fruit fruit){
        System.out.println("other price: ￥10");
        return 10;
    }
}
