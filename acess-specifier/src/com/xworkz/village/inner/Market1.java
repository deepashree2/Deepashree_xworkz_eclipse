package com.xworkz.village.inner;

public class Market1 {
	
	public Market1(){
	  System.out.println("Market1 constructor..");
	}
	
	void sell() {
		System.out.println("sell runing in Market1..");
		buy();
	}
	
	private void buy(){
		System.out.println("buy runing in Market1..");
	}

}
