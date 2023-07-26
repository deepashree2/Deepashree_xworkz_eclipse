package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Mixture;

public class MixtureRunner {

	public static void main(String[] args) {
		
		Mixture mixture = new Mixture();
		mixture.toString();
		System.out.println(mixture);
		mixture.setCompany("MTR");
		System.out.println(mixture.getCompany());
		mixture.setNetWeight(56);
		System.out.println(mixture.getNetWeight());
		mixture.setColor("green");
		System.out.println(mixture.getColor());
		mixture.setIsQualityGood(false);
		System.out.println(mixture.getIsQualityGood());
		mixture.setCost(50.00);
		System.out.println(mixture.getCost());
	}

}
