package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Tap;

public class TapRunner {

	public static void main(String[] args) {
		
		Tap tap = new Tap();
		tap.toString();
		System.out.println(tap);
		tap.setColour("white");
		System.out.println(tap.getColour());
		tap.setOdour("Nothing");
		System.out.println(tap.getOdour());
		tap.setTaste("Good");
		System.out.println(tap.getTaste());
		tap.setTemperature(23);
		System.out.println(tap.getTemperature());
		tap.setTurbidity("Present");
		System.out.println(tap.getTurbidity());
	}

}
