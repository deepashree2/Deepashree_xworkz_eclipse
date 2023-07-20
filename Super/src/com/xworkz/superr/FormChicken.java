package com.xworkz.superr;

public class FormChicken extends Chicken{
	
		int noDays;
		String careTaker;
		
		FormChicken(int noDays, String careTaker,double price, String location){
			super(price, location);
			this.noDays=noDays;
			this.careTaker=careTaker;
		}
		
		@Override
		void printInfo() {
			super.printInfo();
			System.out.println("noDays :"+noDays);
			System.out.println("careTaker :"+careTaker);
		}
}
