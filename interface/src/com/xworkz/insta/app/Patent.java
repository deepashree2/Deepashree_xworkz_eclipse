package com.xworkz.insta.app;

public class Patent implements PatentRules{

	@Override
	public void limitedTime() {
		System.out.println("limited Time");
		
	}

	@Override
	public void followTradeMark() {
		System.out.println("follow Trade Mark");
		
	}
	

}
