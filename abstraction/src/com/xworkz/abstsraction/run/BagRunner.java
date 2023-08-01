package com.xworkz.abstsraction.run;

import com.xworkz.abstraction.app.Bag;
import com.xworkz.abstraction.app.BeachBag;
import com.xworkz.abstraction.app.SchoolBag;

public class BagRunner {

	public static void main(String[] args) {
		
		Bag beachBag = new BeachBag();
		beachBag.brandOfBag();
		beachBag.price();
		System.out.println(beachBag.capacity());
		beachBag.durability();
		
		Bag schoolBag = new SchoolBag();
		schoolBag.brandOfBag();
		schoolBag.price();
		System.out.println(schoolBag.capacity());
		schoolBag.durability();
	}

}
