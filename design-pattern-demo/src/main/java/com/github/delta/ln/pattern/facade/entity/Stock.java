package com.github.delta.ln.pattern.facade.entity;

/**
 *
 */
public class Stock {

    private String code = "APPLE";
    private double price = 9.9;

    public void buy() {
        System.out.println("购买股票：" + this);
    }

    public void sell() {
        System.out.println("出售股票：" + this);
    }

    @Override
    public String toString() {
        return "Stock{ code='" + code + "', price=" + price + "}";
    }
}
