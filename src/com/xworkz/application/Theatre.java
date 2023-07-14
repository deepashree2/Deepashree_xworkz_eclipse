package com.xworkz.application;

public class Theatre {
	
	String name;
	int numSeats;
	MovieName movie;
	String friend;
	
	Theatre(String name, int numSeats, MovieName movie){
		this.name=name;
		this.numSeats=numSeats;
		this.movie=movie;
		
	}
	
	void method(String friend) {
		this.friend=friend;
		
	}
	
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Number of seats :"+numSeats);
		System.out.println("Movie name"+ movie);
		System.out.println("Friend name :"+ friend);
	}

}
