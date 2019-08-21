package com.moses.designpatterns.strategy;

import java.math.BigDecimal;

public class BronzeMemberStrategy implements MemberStrategy {
    @Override
    public BigDecimal calcPrice(BigDecimal booksPrice) {
        System.out.println("铜牌会员打9折");
        return booksPrice.multiply(new BigDecimal("0.95"));
    }
}
