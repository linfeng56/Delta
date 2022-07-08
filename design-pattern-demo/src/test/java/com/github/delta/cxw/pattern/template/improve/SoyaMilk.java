package com.github.delta.cxw.pattern.template.improve;


public abstract class SoyaMilk {


	final void make() {
		
		select(); 
		if(customerWantCondiments()) {
			addCondiments();
		}
		soak();
		beat();
		
	}
	

	void select() {
		System.out.println("hfgh ");
	}
	

	abstract void addCondiments();
	

	void soak() {
		System.out.println("dfgdfg ");
	}
	 
	void beat() {
		System.out.println("dfgdfg  ");
	}
	

	boolean customerWantCondiments() {
		return true;
	}
}
