package com.github.delta.cxw.pattern.builder.improve;



public abstract class HouseBuilder {

	protected House house = new House();
	

	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();
	

	public House buildHouse() {
		return house;
	}
	
}
