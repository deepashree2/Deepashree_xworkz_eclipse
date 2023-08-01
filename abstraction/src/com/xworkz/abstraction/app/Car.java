package com.xworkz.abstraction.app;

public abstract class Car {
	
	public abstract void sunRoof();
	
	public abstract void gpsNavigation();
	
	public void lightWieght() {
		System.out.println("implementing a lighwieght features in car");
	}
	
	public final void carNum() {
		System.out.println("Printing car number is final..");
	}

}
