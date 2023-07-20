package com.xworkz.superr;

public class Chicken {
	
	double price;
	String location;
	
	Chicken(double price, String location){
		super();
		this.price=price;
		this.location=location;
		}
	
	void printInfo() {
		System.out.println("price :"+price);
		System.out.println("location :"+location);
	}

}
