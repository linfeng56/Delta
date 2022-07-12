package com.github.delta.ln.pattern.strategy.impl;

import com.github.delta.ln.pattern.strategy.CashStrategy;

/**
 * 正常收费
 */
public class CashNormal extends CashStrategy {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
