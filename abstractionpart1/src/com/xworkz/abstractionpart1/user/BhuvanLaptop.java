package com.xworkz.abstractionpart1.user;

import com.xworkz.abstractionpart1.abstractioon.Laptop;

public class BhuvanLaptop {
	
	private Laptop laptop;
	
	public BhuvanLaptop(Laptop laptop) {
		this.laptop=laptop;
	}
	
	public void windows() {
		if(laptop!= null) {
			System.out.println("with out null value works");
			this.laptop.display();
		}
		else {
			System.err.println("with null can not work");
		}
	}

}
