package com.xworkz.village.inner;

public class Market {
	
	public Market() {
		System.out.println("Market constructor..");
	}
	
	protected void sell(){
		System.out.println("sell running inside the market..");
	}

	public void buy() {
		System.out.println("buy running inside the market..");
	}
}
