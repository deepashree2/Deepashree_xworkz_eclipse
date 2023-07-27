package com.xworkz.equals.runner;

import com.xworkz.equals.app.Grocery;

public class GroceryRunner {
	public static void main(String[] args) {
	
	Grocery grocery =new Grocery();
	grocery.toString();
	System.out.println(grocery);
	Grocery grocery1 =new Grocery("Publix","Nethra");
	
	Grocery grocery2 =new Grocery("646543","Nethra");
	
	boolean egg = grocery1.equals(grocery2);
	System.out.println("grocery1 and grocery2 is "+egg);

	}
}
