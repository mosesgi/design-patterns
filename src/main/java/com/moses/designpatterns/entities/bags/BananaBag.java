package com.moses.designpatterns.entities.bags;

import com.moses.designpatterns.entities.Bag;

public class BananaBag implements Bag {
    @Override
    public void pack() {
        System.out.println("使用香蕉包装盒 - 竹篮");
    }
}
