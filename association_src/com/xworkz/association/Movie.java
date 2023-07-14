package com.xworkz.association;

public class Movie {
	String movieName;
	String movieHero;
	String movieProducer="Vijaykirgundur";
	String movieBudget;
	
	Director  director = new Director("Prashanth neel", 50000000);
	
	Movie(String movieName,String movieHero){
		this.movieName=movieName;
		this.movieHero=movieHero;
	}
	
	void setMovieBudget(String movieBudget) {
		
		this.movieBudget=movieBudget;
		
	}
	
	void printInfo() {
		System.out.println("Movie Name :"+this.movieName);
		System.out.println("Movie Hero :"+this.movieHero);
		System.out.println("Movie Producer :"+this.movieProducer);
		System.out.println("Movie Budget :"+this.movieBudget);
		this.director.printInfo();
	}

}
