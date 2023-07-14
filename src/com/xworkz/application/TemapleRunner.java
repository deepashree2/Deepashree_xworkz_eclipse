package com.xworkz.application;

public class TemapleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("temple is running in main method..");
		Temple ref = new Temple("Puri Jaganath ",TempleGodName.RADHA);
		ref.godName=TempleGodName.MAHADEVA;
		ref.location="jaganatha puri";
	
		ref.Display();
		
       Temple ref1 = new Temple("Lakshmi ", TempleGodName.KRISHNA);
		ref1.godName=TempleGodName.PARAVATHI;
		ref1.location="hassan";
		ref1.Display();
		

	}

}
