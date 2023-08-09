package com.xworkz.abstractionpart1.abstractioon;

public class KidneyImplements implements Kidney {

	@Override
	public boolean clean() {
		System.out.println("Kidney..");
		return false;
	}
	
	

}
