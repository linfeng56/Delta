package com.github.delta.cxw.pattern.strategy.improve;

public class PekingDuck extends Duck {

	

	public PekingDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new BadFlyBehavior();
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("dfgdf");
	}
	
	

}
