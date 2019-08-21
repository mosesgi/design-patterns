package com.moses.designpatterns.strategy;

import java.math.BigDecimal;

public class StrategyTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(new GoldMemberStrategy());

        BigDecimal finalBill = cart.calculateBill(new BigDecimal("230.1"));
        System.out.println("应付金额为: " + finalBill);
    }
}
