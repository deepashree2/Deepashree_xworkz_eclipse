package com.xworkz.equals.runner;

import com.xworkz.equals.app.Glod;

public class GlodRunner {

	public static void main(String[] args) {

		Glod glod = new Glod();
		glod.toString();
		System.out.println(glod);
		
		Glod glod1 = new Glod("Ring", 45000.00, "SRS", 22);
		
		Glod glod2 = new Glod("Ring", 45000.00, "SRS", 22);
		
		boolean egg = glod1.equals(glod2);
		System.out.println("glod1 and glod2 are :"+egg);

	}

}
