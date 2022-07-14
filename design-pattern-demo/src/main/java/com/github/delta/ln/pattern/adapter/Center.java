package com.github.delta.ln.pattern.adapter;

/**
 * 中锋
 */
public class Center extends Player{

    public Center(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + ": Attack！");
    }

    @Override
    public void defense() {
        System.out.println(name + ": Defense！");
    }
}
