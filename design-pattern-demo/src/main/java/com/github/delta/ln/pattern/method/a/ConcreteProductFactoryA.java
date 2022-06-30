package com.github.delta.ln.pattern.method.a;

import com.github.delta.ln.pattern.method.Product;
import com.github.delta.ln.pattern.method.AbstractProductFactory;

/**
 * 产品A
 */
public class ConcreteProductFactoryA extends AbstractProductFactory {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
