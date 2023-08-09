package com.xworkz.abstractionpart1.user;

import com.xworkz.abstractionpart1.abstractioon.Kidney;

public class HumanKidney {
	
	private Kidney kidney;
	
	public HumanKidney(Kidney kidney) {
		this.kidney=kidney;
	}
	
	public void purify() {
		if(kidney!=null) {
			System.out.println("with out null it works");
			this.kidney.clean();
		}
		else {
			System.out.println("with null it can not works..");
		}
	}

}
