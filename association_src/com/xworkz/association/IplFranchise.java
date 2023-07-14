package com.xworkz.association;

public class IplFranchise {
	
	String teamName;
	int numTimesPlayed =14;
	String captain;
	
	IplFranchise(String teamName, String captain){
		this.teamName=teamName;
		this.captain=captain;
	}
	
	void printInfo() {
		System.out.println("Team Name :"+this.teamName);
		System.out.println("Num Times Played :"+this.numTimesPlayed);
		System.out.println("Captain :"+this.captain);
	}

}
