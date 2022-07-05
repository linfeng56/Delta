package com.github.delta.cxw.pattern.flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebSiteFactory factory = new WebSiteFactory();


		WebSite webSite1 = factory.getWebSiteCategory("ewrwe");

		
		webSite1.use(new User("tom"));


		WebSite webSite2 = factory.getWebSiteCategory("erw");

		webSite2.use(new User("jack"));


		WebSite webSite3 = factory.getWebSiteCategory("er");

		webSite3.use(new User("smith"));


		WebSite webSite4 = factory.getWebSiteCategory("ffg");

		webSite4.use(new User("king"));
		
		System.out.println("dfgf=" + factory.getWebSiteCount());
	}

}
