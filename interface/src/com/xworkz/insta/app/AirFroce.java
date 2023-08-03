package com.xworkz.insta.app;

public class AirFroce implements ArmyRules{
	
	@Override
	public void promotion() {
		 System.out.println("Get promoted to Airforce.. only after :"+AGE);
	 }
	
	
	public void trianing() {
		System.out.println("get hired only when after complete the training");
	}


	@Override
	public void haircut() {
		System.out.println("Haircut is done..");
		
	}

}
