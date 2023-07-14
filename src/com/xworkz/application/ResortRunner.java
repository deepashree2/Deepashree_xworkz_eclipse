package com.xworkz.application;

public class ResortRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Resort is running in main method..");
		Resort ref = new Resort("Nethra", RoomType.QUEEN ,false);
		ref.setownername("Astoria current");
		ref.ownerName="navya";
		ref.roomType=RoomType.QUAD;
		ref.breakFast=true;
		ref.display();
		
		Resort ref1 = new Resort("shruthi", RoomType.DOUBLE_BED ,false);
		ref1.setownername("Astoria current");
		ref1.ownerName="navya";
		ref1.roomType=RoomType.SINGLE_BED;
		ref1.breakFast=true;
		ref1.display();
		

	}

}
