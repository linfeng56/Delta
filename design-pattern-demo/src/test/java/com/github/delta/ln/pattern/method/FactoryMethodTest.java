package com.github.delta.ln.pattern.method;

import com.github.delta.ln.pattern.method.a.ConcreteProductFactoryA;
import com.github.delta.ln.pattern.method.b.ConcreteProductFactoryB;
import org.junit.Test;

/**
 * 工厂方法模式测试
 */
public class FactoryMethodTest {

    /**
     * 产品A测试
     */
    @Test
    public void testProductA(){
        AbstractProductFactory factoryMethod = new ConcreteProductFactoryA();
        factoryMethod.showRemark();
    }

    /**
     * 产品B测试
     */
    @Test
    public void testProductB(){
        AbstractProductFactory factoryMethod = new ConcreteProductFactoryB();
        factoryMethod.showRemark();
    }
}
