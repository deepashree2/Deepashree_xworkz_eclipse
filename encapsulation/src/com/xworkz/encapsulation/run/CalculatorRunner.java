package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.Calculator;

public class CalculatorRunner {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		calculator.toString();
		System.out.println(calculator);
		calculator.setCompany("Shanthi electronics");
		System.out.println(calculator.getCompany());
		calculator.setBrand("Casio");
		System.out.println(calculator.getBrand());
		calculator.setPrice(1000.00);
		System.out.println(calculator.getPrice());
		calculator.setNumOfKeyword(35);
		System.out.println(calculator.getNumOfKeyword());
		calculator.setIsItWork(true);
		System.out.println(calculator.getIsItWork());

	}

}
