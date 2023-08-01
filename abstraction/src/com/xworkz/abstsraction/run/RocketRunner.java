package com.xworkz.abstsraction.run;

import com.xworkz.abstraction.app.ISRO;
import com.xworkz.abstraction.app.NASA;
import com.xworkz.abstraction.app.Rocket;

public class RocketRunner {

	public static void main(String[] args) {
		
		Rocket isro = new ISRO();
		isro.budget();
		isro.launchingDay();
		isro.rocketName();
		isro.launchingTo();
		
		Rocket nasa = new NASA();
		nasa.budget();
		nasa.launchingDay();
		nasa.rocketName();
		nasa.launchingTo();

	}

}
