package com.github.delta.cxw.pattern.strategy.improve;

public abstract class Duck {


	FlyBehavior flyBehavior;

	QuackBehavior quackBehavior;
	
	public Duck() {
	
	}

	public abstract void display();
	
	public void quack() {
		System.out.println("fgdf");
	}
	
	public void swim() {
		System.out.println("dfgf");
	}
	
	public void fly() {

		if(flyBehavior != null) {
			flyBehavior.fly();
		}
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
	
}
