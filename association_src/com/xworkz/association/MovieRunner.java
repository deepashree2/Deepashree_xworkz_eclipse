package com.xworkz.association;

public class MovieRunner {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Movie running in main method");
		Movie ref = new Movie("KGF","YASH");
		ref.movieName="Googly";
		
		ref.movieBudget="10 Core";
		ref.printInfo();
		
		
		
		Movie ref1 = new Movie("Ugram","sri murali");
		ref1.movieName="salar";
		ref1.movieHero="Prabhas";
		ref1.movieBudget="90 Core";
		ref1.printInfo();
		
	}

}
