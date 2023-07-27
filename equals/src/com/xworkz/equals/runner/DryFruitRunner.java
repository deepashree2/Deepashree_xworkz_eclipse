package com.xworkz.equals.runner;

import com.xworkz.equals.app.DryFruit;

public class DryFruitRunner {

	public static void main(String[] args) {

		DryFruit ref = new DryFruit();
		ref.toString();
		System.out.println(ref);
		
		DryFruit ref1 = new DryFruit("Badami", 99.00, 50, "MTR", true, "consumer1");
		DryFruit ref2 = new DryFruit("Badami", 99.00, 50, "MTR", true, "consumer1");
		
		boolean egg = ref1.equals(ref2);
		System.out.println("ref1 and ref2 are :"+egg);

	}

}
