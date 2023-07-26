package com.xworkz.encapsulation.app;

public class HeadSet {
	
	private String company;
	private String brand;
	private double price;
	private String type;
	private boolean isItWork;
	
	public String toString() {
		return "company "+this.company+" brand "+this.brand+" price "+this.price+" type "+this.type+" isItWork "+this.isItWork;
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
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public boolean getIsItWork() {
		return isItWork;
	}
	
	public void setIsItWork(boolean isItWork) {
		this.isItWork=isItWork;
	}

}
