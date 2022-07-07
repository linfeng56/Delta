package com.github.delta.ln.pattern.facade;

import com.github.delta.ln.pattern.facade.entity.NationDebt;
import com.github.delta.ln.pattern.facade.entity.Realty;
import com.github.delta.ln.pattern.facade.entity.Stock;

/**
 * 外观类
 */
public class Fund {

    private NationDebt debt;
    private Realty realty;
    private Stock stock;

    public Fund() {
        this.debt = new NationDebt();
        this.realty = new Realty();
        this.stock = new Stock();
    }

    public void invent() {
        debt.buy();
        realty.sell();
        stock.buy();
    }
}
