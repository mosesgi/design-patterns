package com.moses.designpatterns.entities.bags;

import com.moses.designpatterns.entities.Bag;

public class AppleBag implements Bag {
    @Override
    public void pack() {
        System.out.println("使用苹果包装盒 - 纸箱");
    }
}
