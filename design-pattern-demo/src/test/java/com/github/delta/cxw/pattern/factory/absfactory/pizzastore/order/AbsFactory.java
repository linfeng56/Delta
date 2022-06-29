package com.github.delta.cxw.pattern.factory.absfactory.pizzastore.order;

import com.github.delta.cxw.pattern.factory.absfactory.pizzastore.pizza.Pizza;


public interface AbsFactory {

	public Pizza createPizza(String orderType);
}
