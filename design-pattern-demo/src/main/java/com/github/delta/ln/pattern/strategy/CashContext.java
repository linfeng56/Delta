package com.github.delta.ln.pattern.strategy;

/**
 * 收费
 */
public class CashContext {

    private CashStrategy cs;

    public CashContext(CashStrategy cs) {
        this.cs = cs;
    }

    /**
     * 获得收费金额
     *
     * @param money
     * @return
     */
    public double getResult(double money) {
        return cs.acceptCash(money);
    }
}
