package com.moses.designpatterns.strategy;

import java.math.BigDecimal;

public class SilverMemberStrategy implements MemberStrategy {
    @Override
    public BigDecimal calcPrice(BigDecimal booksPrice) {
        System.out.println("银牌会员打9折");
        return booksPrice.multiply(new BigDecimal("0.9"));
    }
}
