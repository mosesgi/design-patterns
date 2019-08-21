package com.moses.designpatterns.strategy;

import java.math.BigDecimal;

/**
 * 策略模式
 */
public interface MemberStrategy {
    BigDecimal calcPrice(BigDecimal booksPrice);
}
