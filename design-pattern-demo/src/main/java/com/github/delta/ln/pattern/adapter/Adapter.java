package com.github.delta.ln.pattern.adapter;

/**
 * 适配器
 */
public class Adapter extends Player{

    Yaoming ym;

    public Adapter(String name, Yaoming ym) {
        super(name);
        this.ym = ym;
    }

    @Override
    public void attack() {
        System.out.print(name + ":");
        ym.attack();
    }

    @Override
    public void defense() {
        System.out.print(name + ":");
        ym.defense();
    }
}
