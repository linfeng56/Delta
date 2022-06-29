package com.github.delta.cxw.pattern.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.github.delta.cxw.pattern.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {


	SimpleFactory simpleFactory;
	Pizza pizza = null;
	

	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		String orderType = "";
		
		this.simpleFactory = simpleFactory;
		
		do {
			orderType = getType(); 
			pizza = this.simpleFactory.createPizza(orderType);
			

			if(pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println(" ");
				break;
			}
		}while(true);
	}
	

	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza :");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
