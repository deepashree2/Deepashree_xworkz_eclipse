package com.xworkz.encapsulation.app;

public class Calculator {
	
	private String company;
	private String brand;
	private double price;
	private int numOfKeyword;
	private boolean isItWork;
	
	public String toString() {
		return "company "+this.company+ " brand "+this.brand+" price "+this.price +" numOfKeyword "+this.numOfKeyword+" isItWork "+this.isItWork;

	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getNumOfKeyword() {
		return numOfKeyword;
	}
	
	public void setNumOfKeyword(int numOfKeyword) {
		this.numOfKeyword = numOfKeyword;
	}
	
	public boolean getIsItWork() {
		return isItWork;
	}
	
	public void setIsItWork(boolean isItWork) {
		this.isItWork=isItWork;
	}
	
}
