package com.moses.designpatterns.strategy;

import java.math.BigDecimal;

public class GoldMemberStrategy implements MemberStrategy{


    @Override
    public BigDecimal calcPrice(BigDecimal booksPrice) {
        System.out.println("金牌会员打8折");
        return booksPrice.multiply(new BigDecimal("0.8"));
    }
}
