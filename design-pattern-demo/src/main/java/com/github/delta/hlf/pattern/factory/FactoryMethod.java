package com.github.delta.hlf.pattern.factory;

/**
 * 一个用于创建对象的接口，让子类决定实例化哪一个类，Factory Method使得一个类的实例化延迟到子类。
 * 1.当不知道该使用对象的确切类型的时候。
 * 2。当你希望为库或框架提供扩展其内部组件的方法时。
 *
 */
public class FactoryMethod {

    public static void main(String[] args) {
        Application application = new ConcreteProductB();
        Product product = application.createProduct();
        product.method1();
    }
}

interface Product {

    void method1();
}

class ProductA implements Product {

    public void method1() {
        System.out.println("ProductA.method1 executed.");
    }
}

class ProductB implements Product {

    public void method1() {
        System.out.println("ProductB.method1 executed.");
    }
}


abstract class Application {

    abstract Product createProduct();
}

class ConcreteProductA extends Application {

    @Override
    Product createProduct() {
        return new ProductA();
    }
}

class ConcreteProductB extends Application {

    @Override
    Product createProduct() {
        return new ProductB();
    }
}
