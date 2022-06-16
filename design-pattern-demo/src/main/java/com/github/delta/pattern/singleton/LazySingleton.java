package com.github.delta.pattern.singleton;

/**
 * 懒汉模式
 */
public class LazySingleton {

    /**
     * 使用volatile保证变量正常初始化
     */
    private volatile static LazySingleton instance;

    private LazySingleton() {

    }

    /**
     * 实例访问方法
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                //通过双重校验来保证多线程下也只创建一次
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
