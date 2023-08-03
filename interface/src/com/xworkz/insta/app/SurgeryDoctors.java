package com.xworkz.insta.app;

public class SurgeryDoctors implements HospitalRules{

	@Override
	public void hygine() {
		System.out.println("should be hygenic..");
		
	}

	@Override
	public void numOfBeds() {
		System.out.println("45 beds in a rooms");
		
	}

}
