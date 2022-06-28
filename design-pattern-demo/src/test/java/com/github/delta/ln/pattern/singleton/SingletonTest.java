package com.github.delta.ln.pattern.singleton;

import org.junit.Test;

/**
 * 单例模式测试
 */
public class SingletonTest {

    /**
     * 测试懒汉模式
     */
    @Test
    public void testLazySingleton() {
        //多线程下，看看获取的实例是否是同一个
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(LazySingleton.getInstance());
                }
            }).start();
        }
    }

    /**
     * 测试饿汉模式
     */
    @Test
    public void testHungrySingleton(){
        //多线程下，看看获取的实例是否是同一个
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(HungrySingleton.getInstance());
                }
            }).start();
        }
    }

    /**
     * 测试饿汉模式
     */
    @Test
    public void testInnerClassSingleton(){
        //多线程下，看看获取的实例是否是同一个
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(InnerClassSingleton.getInstance());
                }
            }).start();
        }
    }
}
