package com.github.delta.cxw.pattern.template;


public abstract class SoyaMilk {


	final void make() {
		
		select(); 
		addCondiments();
		soak();
		beat();
		
	}
	

	void select() {
		System.out.println("456456 ");
	}
	

	abstract void addCondiments();
	

	void soak() {
		System.out.println("dgdf");
	}
	 
	void beat() {
		System.out.println("fgf");
	}
}
