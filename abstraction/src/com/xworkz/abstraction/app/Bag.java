package com.xworkz.abstraction.app;

public abstract class Bag {
	
	public abstract void brandOfBag();
	
	public abstract void price();
	
	public final int capacity() {
		return 678;
	}
	
	public void durability() {
		System.out.println("More durability..");
	}
	

	
}
