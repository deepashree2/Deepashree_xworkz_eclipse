package com.xworkz.association;

public class IplTeamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub IplTeam
		
		System.out.println("IplTeam is runnig in main method..");
		
		IplTeam ref = new IplTeam(10, "Virat kohli");
		ref.purpuleCapHolder="Harshal patel";
		ref.orangeCapHolder="faf duplesis";
		ref.printInfo();

		IplTeam ref1 = new IplTeam(10, "kl rahul");
		ref1.purpuleCapHolder="shami";
		ref1.orangeCapHolder="shubman gill";
		ref.printInfo();

	}

}
