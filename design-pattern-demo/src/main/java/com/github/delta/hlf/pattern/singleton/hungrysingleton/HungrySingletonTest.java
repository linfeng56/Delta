package com.github.delta.hlf.pattern.singleton.hungrysingleton;

public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance == instance2);
    }
}

/**
 * 饿汉模式，类加载的初始公阶段完成实例的初始化，本质上是借助JVM类加载机制来保证实例的唯一性。
 */
class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
