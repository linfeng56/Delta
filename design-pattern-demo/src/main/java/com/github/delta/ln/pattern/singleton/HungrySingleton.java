package com.github.delta.ln.pattern.singleton;

/**
 * 饿汉模式
 */
public class HungrySingleton {

    /**
     * 类加载时初始化
     */
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    /**
     * 实例访问方法
     *
     * @return
     */
    public static HungrySingleton getInstance() {
        return instance;
    }
}
