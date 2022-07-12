package com.github.delta.ln.pattern.strategy.impl;

import com.github.delta.ln.pattern.strategy.CashStrategy;

/**
 * 满减
 */
public class CashReturn extends CashStrategy {

    /**
     * 满
     */
    private double moneyCondition ;
    /**
     * 减
     */
    private double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;

        if(money >= moneyCondition){
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }

        return result;
    }
}
