package com.moses.designpatterns.strategy;

import java.math.BigDecimal;

public class ShoppingCart {
    private MemberStrategy strategy;

    public ShoppingCart(MemberStrategy strategy){
        this.strategy = strategy;
    }

    public BigDecimal calculateBill(BigDecimal originPrice){
        return strategy.calcPrice(originPrice);
    }
}
