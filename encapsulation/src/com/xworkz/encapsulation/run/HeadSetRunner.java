package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.HeadSet;

public class HeadSetRunner {

	public static void main(String[] args) {
		
		HeadSet headSet = new HeadSet();
		headSet.toString();
		System.out.println(headSet);
		headSet.setBrand("Boat");
		System.out.println(headSet.getBrand());
		headSet.setCompany("Noise");
		System.out.println(headSet.getCompany());
		headSet.setIsItWork(true);
		System.out.println(headSet.getIsItWork());
		headSet.setPrice(899.00);
		System.out.println(headSet.getPrice());
		headSet.setType("airpod");
		System.out.println(headSet.getType());

	}

}
