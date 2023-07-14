package com.xworkz.association;

public class IplTeam {
		int numIplTeam;
		String orangeCapHolder;
		String purpuleCapHolder;
		String highsetRunByTeam="RCB";
		
		IplFranchise ref = new IplFranchise("RCB","Faf duplesis");
		
		IplTeam(int numIplTeam, String orangeCapHolder){
			this.numIplTeam=numIplTeam;
			this.orangeCapHolder=orangeCapHolder;
			
		}
		
		void setpurpHolder(String purpuleCapHolder) {
			this.purpuleCapHolder=purpuleCapHolder;
		}
		
		void printInfo() {
			System.out.println("Num Ipl Team :" + this.numIplTeam);
			System.out.println("Orange Cap Holder :" + this.orangeCapHolder);
			System.out.println("Purpule Cap Holder :" +this. purpuleCapHolder);
			System.out.println("highset RunBy Team :" + this.highsetRunByTeam);
			this.ref.printInfo();

		}
		
		
		
		
}
