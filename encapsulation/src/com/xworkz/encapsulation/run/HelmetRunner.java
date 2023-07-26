package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		
		Helmet helmet = new Helmet();//Steelbird
		helmet.toString();
		System.out.println(helmet);
		helmet.setCompany("Bell Sports");
		System.out.println(helmet.getCompany());
		helmet.setWeight(12);
		System.out.println(helmet.getWeight());
		helmet.setColor("Black");
		System.out.println(helmet.getColor());
		helmet.setSize(5);
		System.out.println(helmet.getSize());
		helmet.setCost(500.00);
		System.out.println(helmet.getCost());
		
	}

}
