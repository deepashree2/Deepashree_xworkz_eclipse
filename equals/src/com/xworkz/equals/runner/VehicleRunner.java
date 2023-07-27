package com.xworkz.equals.runner;

import com.xworkz.equals.app.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.toString();
		
		Vehicle vehicle1 = new Vehicle("Bike",800000.00, 85, "owner1", 5001 );
		
		Vehicle vehicle2 = new Vehicle("Bike",800000.00, 85, "owner1", 5001 );
		
		boolean egg = vehicle1.equals(vehicle2);
		System.out.println("vehicle1 and vehicle2 are :"+egg);
		
	}

}
