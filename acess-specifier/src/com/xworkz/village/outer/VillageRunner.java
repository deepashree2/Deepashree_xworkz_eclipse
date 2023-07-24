package com.xworkz.village.outer;

import com.xworkz.village.inner.NewVillage;

public class VillageRunner {

	public static void main(String[] args) {
		System.out.println("Running protected method.. ");
		NewVillage village = new NewVillage();
		village.enter();
		village.exit();
		
	}

}
