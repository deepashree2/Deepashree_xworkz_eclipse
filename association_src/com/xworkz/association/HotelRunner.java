package com.xworkz.association;

public class HotelRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hotel is runnig in main method..");
		
		Hotel ref = new Hotel("Indra Prastha", "chanrayapatana" );
		ref.lookGood=true;
		ref.hotelName="palaguni";
		ref.location="Hassan";
		ref.printInfo();
		
		Hotel ref1 = new Hotel("Udupi Hotel", "Bangalore" );
		ref1.lookGood=true;
		ref1.hotelName="Ajji mane";
		ref1.location="kunigal";
		ref1.printInfo();

	}

}
