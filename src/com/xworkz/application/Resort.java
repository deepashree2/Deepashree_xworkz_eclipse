package com.xworkz.application;

public class Resort {

	String name;
	String ownerName;
	RoomType roomType;
	boolean breakFast;
	
	
	void setownername(String name){
		this.name=name;
	}
	
	Resort(String ownerName, RoomType roomType, boolean breakFast){
		this.ownerName=ownerName;
		this.roomType=roomType;
		this.breakFast=breakFast;
		
		}
	
	void display() {
		
		System.out.println("Name :"+name);
		System.out.println("Owner Name :"+ownerName);
		System.out.println("Room Type :"+roomType);
		System.out.println("brakFast :"+breakFast);
	}
	
	
	
}
