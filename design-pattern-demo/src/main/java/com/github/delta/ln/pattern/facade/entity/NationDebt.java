package com.github.delta.ln.pattern.facade.entity;

public class NationDebt {

    private String name = "国债";
    private double price = 0.88;

    public void buy() {
        System.out.println("购买国债：" + this);
    }

    public void sell() {
        System.out.println("出售国债：" + this);
    }

    @Override
    public String toString() {
        return "NationDebt{name='" + name + "'" + ", price=" + price + "}";
    }
}
