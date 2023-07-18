package com.xworkz.casting;

public class PumaShoe extends Shoe{
	
	String model;
	String origin;
	
	
	public PumaShoe(String model, String origin,int price, ShoeSize size, ShoeColor color) {
		super(price, size, color);
		this.model=model;
		this.origin=origin;
	}
	
	
	void  printInfo()
	{
		System.out.println("Model :"+model);
		System.out.println("Origin :"+origin);
		System.out.println("price :"+price);
		System.out.println("size :"+size);
		System.out.println("color :"+color);
		
	}

}
