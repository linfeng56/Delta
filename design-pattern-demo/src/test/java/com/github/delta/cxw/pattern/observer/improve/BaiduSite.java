package com.github.delta.cxw.pattern.observer.improve;

public class BaiduSite implements Observer {


	private float temperature;
	private float pressure;
	private float humidity;


	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}


	public void display() {
		System.out.println("=======");
		System.out.println(temperature + "***");
		System.out.println(pressure + "***");
		System.out.println(humidity + "***");
	}

}
