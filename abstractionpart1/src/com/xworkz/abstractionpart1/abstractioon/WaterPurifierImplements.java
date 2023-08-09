package com.xworkz.abstractionpart1.abstractioon;

public class WaterPurifierImplements implements WaterPurifier{

	@Override
	public boolean filter() {
		System.out.println("WaterPurifier purify the water..");
		return false;
	}
	
	

}
