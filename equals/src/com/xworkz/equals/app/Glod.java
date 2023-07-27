package com.xworkz.equals.app;

public class Glod {
	
	
	private String glodDesign;
	private double price;
	private String shopName;
	private int glodCarrot;
	
	@Override
	public String toString() {
		System.out.println("invoking toString in Glod..");
		return "glodDesign "+this.glodDesign+" price "+this.price+ " shopName "+this.shopName+" glodCarrot "+this.glodCarrot;
		
	}
	
	public Glod() {
		
	}

	public Glod(String glodDesign, double price, String shopName, int glodCarrot) {
		super();
		this.glodDesign = glodDesign;
		this.price = price;
		this.shopName = shopName;
		this.glodCarrot = glodCarrot;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("Without null can comapre");
			if(obj instanceof Glod) {
				System.out.println(this);
				System.out.println(obj);
				
				Glod glod = (Glod)obj;
				if(this.glodDesign == glod.glodDesign && this.price == glod.price && this.shopName == glod.shopName && this.glodCarrot == glod.glodCarrot) {
					System.out.println("Both data are same");
					return true;
				}
				else {
					System.err.println("Both data are not same..");
				}
				
			}
		}
		else {
			System.err.println("with null can not comapre..");
		}
		return false;
	}
	

}
