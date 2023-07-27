package com.xworkz.equals.app;

public class Slipper {
	
	private String brand;
	private String type;
	private String slipperConsumerName;
	private double price;
	private String ownerName;
	private boolean isItWorthy;
	private String slipperFor;
	
	@Override
	public String toString() {
		System.out.println("invoking toString in Slipper..");
		return "brand "+this.brand+" type "+this.type+" slipperConsumerName "+this.slipperConsumerName+" price "+this.price+" ownerName "+this.ownerName
				+" isItWorthy "+ this.isItWorthy+" slipperFor "+this.slipperFor;
	}
	
	
	public Slipper() {
		
	}


	public Slipper(String brand, String type, String slipperConsumerName, double price, String ownerName,
			boolean isItWorthy, String slipperFor) {
		super();
		this.brand = brand;
		this.type = type;
		this.slipperConsumerName = slipperConsumerName;
		this.price = price;
		this.ownerName = ownerName;
		this.isItWorthy = isItWorthy;
		this.slipperFor = slipperFor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("with out null can compare");
			if(obj instanceof Slipper) {
				System.out.println(this);
				System.out.println(obj);
				
				Slipper ref = (Slipper)obj;
				if(this.brand == ref.brand && this.type == ref.type && this.slipperConsumerName == ref.slipperConsumerName && this.price == ref.price && this.ownerName == ref.ownerName && this.isItWorthy == ref.isItWorthy &&  this.slipperFor == ref.slipperFor) {
					System.out.println("Both data are same..");
					return true;
				}
				else {
					System.err.println("Both data are not same..");
				}
			}
		}
		else {
			System.err.println("with null can not compare");
		}
		return false;
	}

}
