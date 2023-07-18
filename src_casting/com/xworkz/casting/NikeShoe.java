package com.xworkz.casting;

public class NikeShoe extends Shoe{
	
	String ceo;
	String brandAmbassador;
	
	public NikeShoe(String ceo, String brandAmbassador, int price, ShoeSize size, ShoeColor color){
		super(price, size, color);
		this.ceo=ceo;
		this.brandAmbassador=brandAmbassador;
	}
	
	void printinfo() {
		System.out.println("ceo :"+ceo);
		System.out.println("brandAmbassador :"+ brandAmbassador);
		System.out.println("price :"+price);
		System.out.println("size :"+size);
		System.out.println("color :"+color);
	}

}
