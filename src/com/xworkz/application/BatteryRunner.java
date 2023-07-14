package com.xworkz.application;

public class BatteryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Battery is running in main method..");
		Battery ref =new Battery("IKEA",BatteryType.PERSONAL_BRANDING);
		ref.lightSpeed=234;
		ref.type=BatteryType.PRODUCT_BRANDING;
		ref.display();		
				
				
		Battery ref1 =new Battery("Dura cell",BatteryType.RETAIL_BRANDING);
		
		ref1.lightSpeed=656;
		ref1.type=BatteryType.SERVICE_BRANDING;
		ref1.display();
				
	}

}
