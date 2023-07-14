package com.xworkz.application;

public class HospitalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hospital is running in main method..");
		
		Hospital ref = new Hospital("Jayadeva",HospitalOwner.BHAVYA);
		ref.nurseName="reka";
		ref.owner=HospitalOwner.JOYTHIKA;
		ref.display();		
		
		
		Hospital ref1 = new Hospital("ssm",HospitalOwner.SATHYA);
		ref1.nurseName="naveena";
		ref1.owner=HospitalOwner.NAVYA;
		ref1.display();	
	}

}
