package com.xworkz.equals.app;

public class Vehicle {

	private String vehicleType;
	private double price;
	private int speed;
	private String vehicleOwner;
	private int vehicleDlNum;
	
	@Override
	public String toString() {
		System.out.println("invoking toString in Vehicle");
		return "vehicleType "+this.vehicleType+ " price "+this.price+" speed "+this.speed+" vehicleOwner "+this.vehicleOwner+" vehicleDlNum "+this.vehicleDlNum;
		}
	
	public Vehicle() {
		
	}

	public Vehicle(String vehicleType, double price, int speed, String vehicleOwner, int vehicleDlNum) {
		super();
		this.vehicleType = vehicleType;
		this.price = price;
		this.speed = speed;
		this.vehicleOwner = vehicleOwner;
		this.vehicleDlNum = vehicleDlNum;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			System.out.println("without null can compare..");
			if(obj instanceof Vehicle) {
				System.out.println(this);
				System.out.println(obj);
				
				Vehicle ref =(Vehicle)obj;
				if(this.vehicleType == ref.vehicleType && this.price == ref.price && this.speed == ref.speed && this.vehicleOwner == ref.vehicleOwner && this.vehicleDlNum == ref.vehicleDlNum) {
					System.out.println("Both data are same..");
					return true;
				}
				else {
					System.err.println("Both data are not same");
				}
			}
		}
		else
		{
			System.err.println("with null can not compare..");
		}
		return false;
	}
	
}
