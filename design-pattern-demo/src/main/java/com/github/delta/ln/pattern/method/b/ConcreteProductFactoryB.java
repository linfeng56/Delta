package com.github.delta.ln.pattern.method.b;

import com.github.delta.ln.pattern.method.Product;
import com.github.delta.ln.pattern.method.AbstractProductFactory;

public class ConcreteProductFactoryB extends AbstractProductFactory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
