package com.github.delta.ln.pattern.factory.b;

import com.github.delta.ln.pattern.factory.Product;
import com.github.delta.ln.pattern.factory.AbstractProductFactory;

public class ConcreteProductFactoryB extends AbstractProductFactory {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
