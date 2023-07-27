package com.xworkz.equals.runner;

import com.xworkz.equals.app.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {

		Slipper ref = new Slipper();
		ref.toString();
		System.out.println(ref);
		
		Slipper ref1 = new Slipper("puma","heels", "coustmer1", 600.00, "owner1", false, "Women");
		
		Slipper ref2 = new Slipper("puma","heels", "coustmer1", 600.00, "owner1", false, "Women");
		
		boolean deepa = ref1.equals(ref2);
		System.out.println("ref1 and ref2 are :"+deepa);
	}

}
