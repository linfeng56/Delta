package com.github.delta.cxw.pattern.factory.absfactory.pizzastore.order;

import com.github.delta.cxw.pattern.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.github.delta.cxw.pattern.factory.absfactory.pizzastore.pizza.BJPepperPizza;
import com.github.delta.cxw.pattern.factory.absfactory.pizzastore.pizza.Pizza;


public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println(" ");
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
