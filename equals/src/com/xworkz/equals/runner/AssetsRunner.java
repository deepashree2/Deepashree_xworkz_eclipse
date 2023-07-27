package com.xworkz.equals.runner;

import com.xworkz.equals.app.Assets;

public class AssetsRunner {

	public static void main(String[] args) {
		
		Assets assets = new Assets();
		assets.toString();
		System.out.println(assets);
		
		Assets assets1 = new Assets("Vehicles", 4.5f, true);
		
		Assets assets2 = new Assets("Vehicles", 4.5f, true);
		
		boolean egg = assets1.equals(assets2);
		System.out.println("assets1 and assets2 are :"+egg);
	}

}
