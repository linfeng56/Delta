package com.github.delta.cxw.pattern.adapter.objectadapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sfds");
		Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}

}
