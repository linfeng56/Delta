package com.github.delta.cxw.pattern.factory.simplefactory.pizzastore.order;

import com.github.delta.cxw.pattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import com.github.delta.cxw.pattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import com.github.delta.cxw.pattern.factory.simplefactory.pizzastore.pizza.PepperPizza;
import com.github.delta.cxw.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class SimpleFactory {


	public Pizza createPizza(String orderType) {

		Pizza pizza = null;

		System.out.println(" ");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName(" ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName(" ");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName(" ");
		}
		
		return pizza;
	}
	

	
	public static Pizza createPizza2(String orderType) {

		Pizza pizza = null;

		System.out.println("2");
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("  ");
		} else if (orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("");
		} else if (orderType.equals("pepper")) {
			pizza = new PepperPizza();
			pizza.setName("");
		}
		
		return pizza;
	}

}
