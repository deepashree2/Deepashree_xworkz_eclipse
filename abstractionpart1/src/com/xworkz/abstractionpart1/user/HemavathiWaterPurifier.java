package com.xworkz.abstractionpart1.user;

import com.xworkz.abstractionpart1.abstractioon.WaterPurifier;

public class HemavathiWaterPurifier {
	
	private WaterPurifier waterPurifier;
	
	public HemavathiWaterPurifier(WaterPurifier waterPurifier) {
		this.waterPurifier=waterPurifier;
	}
	
	public void waterCapcity() {
		if(waterPurifier!=null) {
			System.out.println("with out null it works");
			this.waterPurifier.filter();
		}
		else {
			System.out.println("with null it can not work..");
		}
	}

}
