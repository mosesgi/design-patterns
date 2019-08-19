package com.moses.designpatterns.entities.bags;

import com.moses.designpatterns.entities.Bag;

public class OrangeBag implements Bag {
    @Override
    public void pack() {
        System.out.println("使用橙子包装盒 - 网兜");
    }
}
