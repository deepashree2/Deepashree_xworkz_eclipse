package com.xworkz.insta.app;

public class ResOfEmloyeesMetro implements MetroRules{

	@Override
	public void buyToken() {
		System.out.println("Buy a token before going to metro");
		
	}

	@Override
	public void getCheck() {
		System.out.println("Get check once before going to metro");
		
	}

}
