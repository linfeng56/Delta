package com.github.delta.cxw.pattern.strategy.improve;

public class ToyDuck extends Duck{

	
	public ToyDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new NoFlyBehavior();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("dfgds");
	}

	
	public void quack() {
		System.out.println("dfgdfg");
	}
	
	public void swim() {
		System.out.println("dfgdf");
	}
	
	
}
