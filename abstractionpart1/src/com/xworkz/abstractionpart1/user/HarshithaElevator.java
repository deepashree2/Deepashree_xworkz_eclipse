package com.xworkz.abstractionpart1.user;

import com.xworkz.abstractionpart1.abstractioon.Elevator;

public class HarshithaElevator {
	
	private Elevator elevator;
	
	public HarshithaElevator(Elevator elevator) {
		this.elevator=elevator;
	}
	
	public void wieghtCapcity() {
		if(elevator!=null) {
			System.out.println("with out null it works");
			this.elevator.carryLaugage();
		}
		else {
			System.out.println("with null it can not work..");
		}
		
	}

}
