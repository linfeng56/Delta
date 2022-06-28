package com.github.delta.ln.pattern.factory;

/**
 * 工厂方法模式
 */
public abstract class AbstractProductFactory {

    /**
     * 抽象方法，具体实现交给子类
     */
    protected abstract Product createProduct();

    /**
     * 显示产品描述
     */
    public void showRemark() {
        Product product = createProduct();
        System.out.println(product.remark());
    }
}
