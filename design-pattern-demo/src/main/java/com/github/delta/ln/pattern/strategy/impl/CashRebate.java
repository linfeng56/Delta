package com.github.delta.ln.pattern.strategy.impl;

import com.github.delta.ln.pattern.strategy.CashStrategy;

/**
 * 打折
 */
public class CashRebate extends CashStrategy {

    /**
     * 折扣
     */
    private double moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
