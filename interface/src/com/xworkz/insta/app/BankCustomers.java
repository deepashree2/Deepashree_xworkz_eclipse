package com.xworkz.insta.app;

public class BankCustomers implements BankRules{

	@Override
	public void payInterestOnTime() {
		System.out.println("pay Interest On Time");
		
	}

	@Override
	public void bringAccountBook() {
		System.out.println("bring Account Book");
		
	}

}
