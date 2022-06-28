package com.github.delta.ln.pattern.factory.a;

import com.github.delta.ln.pattern.factory.Product;
import com.github.delta.ln.pattern.factory.AbstractProductFactory;

/**
 * 产品A
 */
public class ConcreteProductFactoryA extends AbstractProductFactory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
