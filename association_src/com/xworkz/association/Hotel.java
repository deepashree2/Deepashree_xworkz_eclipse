package com.xworkz.association;

public class Hotel {
	
		String hotelName;
		String location;
		Boolean lookGood;
		int networth = 78910235;
		
		HotelOwner ref = new HotelOwner("shivu","Nethra", "child1, child2");
		
		Hotel(String hotelName, String location){
			this.hotelName=hotelName;
			this.location=location;
		}
		
		void setLookGood(Boolean lookGood) {
			this.lookGood=lookGood;
		}
		
		void printInfo() {
			System.out.println("Hotel Name :" +this.hotelName);
			System.out.println("Location :" + this.location);
			System.out.println("lookGood :" + this.lookGood);
			System.out.println("networth :" + this.networth);
			this.ref.printInfo();

		}

}
