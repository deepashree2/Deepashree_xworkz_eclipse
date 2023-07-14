package com.xworkz.application;

public class TheatreRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Theatre is running in main method..");
		Theatre ref = new Theatre("SBG", 2, MovieName.GOOGLY);
		ref.friend="Nethra";
		ref.movie=MovieName.KANTHARA;
		ref.friend="sahana";
		ref.display();
		Theatre ref1 = new Theatre("sayadri", 2, MovieName.KGF);
		ref1.friend="Nethra";
		ref1.movie=MovieName.KIRATHAKA;
		ref1.friend="sushma";
		ref1.display();
		

	}

}
