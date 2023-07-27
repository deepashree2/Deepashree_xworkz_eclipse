package com.xworkz.equals.app;

public class DryFruit {
	
	String dryFruitName;
	double price;
	int quantity;
	String brand;
	boolean isItHealthy;
	String consumerName;
	
	@Override
	public String toString() {
		System.out.println("invoking toString in DryFruit..");
		return "dryFruitName "+this.dryFruitName+" price "+this.price+" quantity "+this.quantity+" brand "+this.brand+" isItHealthy "
				+this.isItHealthy+" consumerName "+this.consumerName;
				
	}
	
	public DryFruit() {
		
	}

	public DryFruit(String dryFruitName, double price, int quantity, String brand, boolean isItHealthy,
			String consumerName) {
		super();
		this.dryFruitName = dryFruitName;
		this.price = price;
		this.quantity = quantity;
		this.brand = brand;
		this.isItHealthy = isItHealthy;
		this.consumerName = consumerName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("without null can compare..");
			if(obj instanceof DryFruit) {
				System.out.println(this);
				System.out.println(obj);
				
				DryFruit ref = (DryFruit)obj;
				
				if(this.dryFruitName == ref.dryFruitName && this.price == ref.price && this.quantity == ref.quantity && this.brand == ref.brand && this.isItHealthy == ref.isItHealthy && this.consumerName ==ref.consumerName) {
					System.out.println("Both data are same");
					return true;
					
				}
				else {
					System.out.println("Both data are not same");
				}
			}
		}
		else {
			System.err.println("with null can not compare..");
		}
		return false;
	}

}
