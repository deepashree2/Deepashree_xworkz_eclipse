package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		
		Grinder grinder = new Grinder();
		grinder.toString();
		System.out.println(grinder);
		grinder.setName("Grinder1");
		System.out.println(grinder.getName());
		grinder.setType("hand");
		System.out.println(grinder.getType());
		grinder.setWeight(456);
		System.out.println(grinder.getWeight());
		grinder.setCapcity(97646);
		System.out.println(grinder.getCapcity());
		grinder.setRpm(7532);
		System.out.println(grinder.getRpm());

	}

}
