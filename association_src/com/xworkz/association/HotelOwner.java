package com.xworkz.association;

public class HotelOwner {
	
	String name;
	String wife;
	int numchild = 2;
	String childName;
	
	HotelOwner(String name,String wife, String childName){
		this.name=name;
		this.wife=wife;
		this.childName=childName;
		
		
	}
	
	void printInfo() {
		System.out.println("Name :"+this.name);
		System.out.println("Wife :"+this.wife );
		System.out.println("Num child :"+this.numchild);
		System.out.println("Child Name :"+this.childName);
	}

}
