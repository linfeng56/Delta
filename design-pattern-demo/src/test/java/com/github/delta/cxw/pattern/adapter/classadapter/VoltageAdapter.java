package com.github.delta.cxw.pattern.adapter.classadapter;


public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		int srcV = output220V();
		int dstV = srcV / 44 ; //5v
		return dstV;
	}

}
