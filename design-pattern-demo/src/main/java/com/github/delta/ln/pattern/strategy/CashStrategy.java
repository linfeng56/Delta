package com.github.delta.ln.pattern.strategy;

/**
 * 收费策略
 */
public abstract class CashStrategy {

    /**
     * 收费的计算方法
     *
     * @param money
     * @return
     */
    public abstract double acceptCash(double money);
}
