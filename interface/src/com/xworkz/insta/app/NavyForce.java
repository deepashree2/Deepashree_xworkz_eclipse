package com.xworkz.insta.app;

public class NavyForce implements ArmyRules{
	
	public void promotion() {
		 System.out.println("Get promoted to Airforce.. only after :"+AGE);
	 }

	@Override
	public void haircut() {
		System.out.println("haircut is done..");
		
	}
}
