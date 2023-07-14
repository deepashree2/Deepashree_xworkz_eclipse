package com.xworkz.application;

public class Hospital {
	String name;
	HospitalOwner owner;
	int numDoc =34;
	String nurseName;
	
	Hospital(String name, HospitalOwner owner)
	{
		this.name=name;
		this.owner=owner;
	}
	
	void method(String nurseName) {
		this.nurseName=nurseName;
	}
	
	void display() {
		System.out.println("name :"+name);
		System.out.println("owner :"+owner);
		System.out.println("numDoc :"+numDoc);
		System.out.println("nurseName :"+nurseName);
	}

}
