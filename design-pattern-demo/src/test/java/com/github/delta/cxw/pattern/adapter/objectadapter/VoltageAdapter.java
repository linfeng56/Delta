package com.github.delta.cxw.pattern.adapter.objectadapter;

public class VoltageAdapter  implements IVoltage5V {

	private Voltage220V voltage220V;
	
	

	public VoltageAdapter(Voltage220V voltage220v) {
		
		this.voltage220V = voltage220v;
	}



	@Override
	public int output5V() {
		
		int dst = 0;
		if(null != voltage220V) {
			int src = voltage220V.output220V();
			System.out.println("220v dy");
			dst = src / 44;
			System.out.println("dy=" + dst);
		}
		
		return dst;
		
	}

}
