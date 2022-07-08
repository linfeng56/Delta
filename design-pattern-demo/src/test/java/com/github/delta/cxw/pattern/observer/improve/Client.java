package com.github.delta.cxw.pattern.observer.improve;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeatherData weatherData = new WeatherData();
		

		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();
		

		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);
		

		System.out.println(1);
		weatherData.setData(10f, 100f, 30.3f);
		
		
		weatherData.removeObserver(currentConditions);

		System.out.println();
		System.out.println(2);
		weatherData.setData(10f, 100f, 30.3f);
	}

}
