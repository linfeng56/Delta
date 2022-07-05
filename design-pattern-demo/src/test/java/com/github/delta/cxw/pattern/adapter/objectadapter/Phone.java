package com.github.delta.cxw.pattern.adapter.objectadapter;

public class Phone {

	public void charging(IVoltage5V iVoltage5V) {
		if(iVoltage5V.output5V() == 5) {
			System.out.println("5V");
		} else if (iVoltage5V.output5V() > 5) {
			System.out.println("dayu5V");
		}
	}
}
