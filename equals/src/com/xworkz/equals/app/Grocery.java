package com.xworkz.equals.app;

public class Grocery {
	private String brand;
	private String consumerName;
	
	
	@Override
	public String toString() {
		System.out.println("invoking toString in grocery class..");
		return "brand "+this.brand+" consumerName "+this.consumerName;
	}
	
	public Grocery()
	{
		
	}
	
		
	public Grocery(String brand, String consumerName) {
				this.brand=brand;
				this.consumerName=consumerName;
				
			}
	
	@Override
	public boolean equals(Object obj) {
			if(obj != null) {
				System.out.println("null can compare");
				if(obj instanceof Grocery) {
					System.out.println(this);
					System.out.println(obj);
					Grocery ref = (Grocery)obj;
					if(this.brand == ref.brand && this.consumerName == ref.consumerName) {
						System.out.println("both reference are same");
						return true;
					}
					else {
						System.err.println("both reference are same");
					}
				}
			}
			else {
				System.err.println("null can not comapare");
			}
			return false;
	}
}
