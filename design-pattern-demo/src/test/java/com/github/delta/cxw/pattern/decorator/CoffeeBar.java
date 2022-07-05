package com.github.delta.cxw.pattern.decorator;

public class CoffeeBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Drink order = new LongBlack();
		System.out.println(order.cost());
		System.out.println(order.getDes());


		order = new Milk(order);

		System.out.println(order.cost());
		System.out.println( order.getDes());



		order = new Chocolate(order);

		System.out.println(order.cost());
		System.out.println(order.getDes());



		order = new Chocolate(order);

		System.out.println(order.cost());
		System.out.println(order.getDes());
	
		System.out.println("===========================");
		
		Drink order2 = new DeCaf();
		
		System.out.println(order2.cost());
		System.out.println(order2.getDes());
		
		order2 = new Milk(order2);
		
		System.out.println(order2.cost());
		System.out.println(order2.getDes());

	
	}

}
