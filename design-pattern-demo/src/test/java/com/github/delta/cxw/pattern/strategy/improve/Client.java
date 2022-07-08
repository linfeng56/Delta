package com.github.delta.cxw.pattern.strategy.improve;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();//
		
		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();
		
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();
		

		pekingDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("4544");
		pekingDuck.fly();
	}

}
