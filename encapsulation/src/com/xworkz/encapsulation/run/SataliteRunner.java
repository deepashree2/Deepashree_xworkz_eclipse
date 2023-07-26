package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Satalite;

public class SataliteRunner {

	public static void main(String[] args) {
		
		Satalite satalite = new Satalite();
		satalite.toString();
		System.out.println(satalite);
		satalite.setSataliteName("Chadrayana-3");
		System.out.println(satalite.getSataliteName());
		satalite.setTotalCost(65000000.00);
		System.out.println(satalite.getTotalCost());
		satalite.setDirecName("S Somanath");
		System.out.println(satalite.getDirecName());
		satalite.setLaunchingCountry("India");
		System.out.println(satalite.getLaunchingCountry());
		satalite.setLaunchingLocation("HariKota");
		System.out.println(satalite.getLaunchingLocation());
	}

}
