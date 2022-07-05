package com.github.delta.cxw.pattern.flyweight;


public class ConcreteWebSite extends WebSite {


	private String type = "";

	

	public ConcreteWebSite(String type) {
		
		this.type = type;
	}


	@Override
	public void use(User user) {
		// TODO Auto-generated method stub
		System.out.println( type + " " + user.getName());
	}
	
	
}
