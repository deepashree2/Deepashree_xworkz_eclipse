package com.xworkz.casting;

public class ShoeRunner{
	
	public static void main(String []args) {
	
	PumaShoe puma = new PumaShoe("High hells", " leather shoe",800, ShoeSize.FIVE,  ShoeColor.GREY); 
	puma.printInfo();
	
	NikeShoe nike = new NikeShoe("John Donahoe", " Ronaldo", 890,ShoeSize.TEN , ShoeColor.ORANGE_WHITE);
	nike.printinfo();
	
	
	
}
}
