package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Dosa;

public class DosaRunner {

	public static void main(String[] args) {
		
		Dosa dosa = new Dosa();
	//	System.out.println(dosa.getType());
		dosa.toString();
		System.out.println(dosa);
		dosa.setType("Masala Dosa");
		System.out.println(dosa.getType());
		dosa.setPrice(30.00);
		System.out.println(dosa.getPrice());
		dosa.setPlayaForDosa("potato playa");
		System.out.println(dosa.getPlayaForDosa());
		dosa.setDosaMadeFrom("Shop");
		System.out.println(dosa.getDosaMadeFrom());
		dosa.setIsDosaTasty(true);
		System.out.println(dosa.getIsDosaTasty());
		
	}

}
