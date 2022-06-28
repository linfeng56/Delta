package com.github.delta.hlf.pattern.singleton.innerclasssingleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InnerClassSingletonTest {

    public static void main(String[] args)
            throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                InnerClassSingleton instance = InnerClassSingleton.getInstance();
                System.out.println("线程1：");
                System.out.println(instance);
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                InnerClassSingleton instance = InnerClassSingleton.getInstance();
                System.out.println("线程2：");
                System.out.println(instance);
            }
        }).start();

        // 破坏单例
        Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        InnerClassSingleton instance3 = declaredConstructor.newInstance();

        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        System.out.println("--------------破坏单例--------------");
        System.out.println(instance);
        System.out.println(instance3);
        System.out.println(instance == instance3);

        // 序列化
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("innerClassSingleton"));
        oos.writeObject(instance);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("innerClassSingleton"));
        InnerClassSingleton innerClassSingleton = ((InnerClassSingleton) ois.readObject());
        System.out.println("反序列化：");
        System.out.println(innerClassSingleton);
    }
}

/**
 * 静态内部类本质上也是利用类的加载机制来保证线程安全。只有在实际使用的时候，才会触发类的初始化，所以也是懒加载的一种形式。
 */
class InnerClassSingleton implements Serializable {

    private static final long serialVersionUID = -3174302954316922068L;

    private static class InnerClassHolder {

        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
        // 不加入这个判断时会导致可以反射出多个实例。
        //if (InnerClassHolder.instance != null) {
        //    throw new RuntimeException("实例已初始化不能再次实例化。");
        //}
    }

    public static InnerClassSingleton getInstance() {
        try {
            Thread.sleep(800L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return InnerClassHolder.instance;
    }
}
