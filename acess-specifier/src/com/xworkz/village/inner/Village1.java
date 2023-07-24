package com.xworkz.village.inner;

public class Village1 {
	public Village1() {
		System.out.println("Village1 constructor");
	}
	
	void enter() {
		System.out.println("enter is running in Village1");
		exit();//Private acess specifier only access with in the class
	}
	
	
	private void exit() {
		System.out.println("exit is running in Village1");
	}
}
