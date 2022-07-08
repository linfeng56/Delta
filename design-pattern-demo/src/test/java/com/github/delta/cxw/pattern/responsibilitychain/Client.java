package com.github.delta.cxw.pattern.responsibilitychain;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PurchaseRequest purchaseRequest = new PurchaseRequest(1, 31000, 1);
		

		DepartmentApprover departmentApprover = new DepartmentApprover("234");
		CollegeApprover collegeApprover = new CollegeApprover("345");
		ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("gfd");
		SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("dsf");
	
	

		departmentApprover.setApprover(collegeApprover);
		collegeApprover.setApprover(viceSchoolMasterApprover);
		viceSchoolMasterApprover.setApprover(schoolMasterApprover);
		schoolMasterApprover.setApprover(departmentApprover);
		
		
		
		departmentApprover.processRequest(purchaseRequest);
		viceSchoolMasterApprover.processRequest(purchaseRequest);
	}

}
