package com.xworkz.superr;

public class BoilerChicken extends Chicken {
	
	boolean alive;
	int weight;
	
	BoilerChicken(boolean alive, int weight,double price, String location){
		super(price, location);
		this.alive=alive;
		this.weight=weight;
	}
	
	@Override
	void printInfo() {
		super.printInfo();
		System.out.println("alive :"+alive);
		System.out.println("weight :"+weight);
	}

}
