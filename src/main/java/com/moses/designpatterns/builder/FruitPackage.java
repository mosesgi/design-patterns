package com.moses.designpatterns.builder;

import com.moses.designpatterns.entities.fruits.Apple;
import com.moses.designpatterns.entities.fruits.Banana;
import com.moses.designpatterns.entities.fruits.Orange;

/**
 * 水果套餐类
 */
public class FruitPackage {
    private Apple apple;
    private Banana banana;
    private Orange orange;

    private int discount;
    private int totalPrice;

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    public void setOrange(Orange orange) {
        this.orange = orange;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int cost(){
        return this.totalPrice;
    }

    public void init(){
        if(apple != null){
            totalPrice += apple.price();
        }
        if (null != orange){
            totalPrice += orange.price();
        }
        if (null != banana){
            totalPrice += banana.price();
        }
        if (totalPrice > 0){
            totalPrice -= discount;
        }
    }

    public void showItems(){
        System.out.println("totalPrice: " + this.totalPrice);
    }
}
