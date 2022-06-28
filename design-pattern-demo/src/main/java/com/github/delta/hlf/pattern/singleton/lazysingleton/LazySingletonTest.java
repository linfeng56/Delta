package com.github.delta.hlf.pattern.singleton.lazysingleton;

public class LazySingletonTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            }
        }
        ).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                LazySingleton instance = LazySingleton.getInstance();
                System.out.println(instance);
            }
        }
        ).start();
    }
}

class LazySingleton {

    private static LazySingleton instance;

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
