package com.github.delta.ln.pattern.adapter;

/**
 * 运动员
 */
public abstract class Player {

    /**
     * 名称
     */
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    /**
     * 进攻
     */
    public abstract void attack();

    /**
     * 防守
     */
    public abstract void defense();
}
