package com.github.delta.cxw.pattern.responsibilitychain;

public abstract class Approver {

	Approver approver;
	String name;
	
	public Approver(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}


	public void setApprover(Approver approver) {
		this.approver = approver;
	}
	

	public abstract void processRequest(PurchaseRequest purchaseRequest);
	
}
