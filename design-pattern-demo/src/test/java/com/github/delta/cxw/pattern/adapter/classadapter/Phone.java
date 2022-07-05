package com.github.delta.cxw.pattern.adapter.classadapter;

public class Phone {


	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("5V");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("220V");
		}
	}
}
