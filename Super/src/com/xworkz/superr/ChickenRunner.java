package com.xworkz.superr;

public class ChickenRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken chicken = new Chicken(340, "Banglore");
		chicken.printInfo();
		FormChicken formChicken = new FormChicken(56,"owner", 456.00, "Hassan");
		formChicken.printInfo();
		BoilerChicken boilerChicken =new BoilerChicken(true,2,895.00, "785");
		boilerChicken.printInfo();
		

	}

}
