package com.xworkz.insta.app;

public class SaloonStaff implements SaloonRules{

	@Override
	public void Sanitation() {
		System.out.println("Saloon must be Sanitaized");
		
	}

	@Override
	public void Licensing() {
		System.out.println("Saloon must be Licensed");
		
	}

}
