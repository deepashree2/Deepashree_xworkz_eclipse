package com.xworkz.abstractionpart1.runner;

import com.xworkz.abstractionpart1.abstractioon.Laptop;

public class LaptopImplements implements Laptop{

	@Override
	public boolean display() {
		System.out.println("Laptop have Display....");
		return true;
	}

}
