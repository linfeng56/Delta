package com.github.delta.ln.pattern.facade.entity;

public class Realty {
    private String name = "汤臣一品";
    private double price = 1688;

    public void buy() {
        System.out.println("购买汤臣一品：" + this);
    }

    public void sell() {
        System.out.println("出售汤臣一品：" + this);
    }

    @Override
    public String toString() {
        return "Realty{name='" + name + "'" + ", price=" + price + "}";
    }
}
