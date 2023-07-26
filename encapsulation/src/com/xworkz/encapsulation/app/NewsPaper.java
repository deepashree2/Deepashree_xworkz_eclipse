package com.xworkz.encapsulation.app;

public class NewsPaper {
	private String name;
	private double price;
	private String owner;
	private int numOfCustomers;
	private boolean isNewsIsGood;
	
	public String toString() {
		return "name "+this.name+" price "+this.price+" owner "+this.owner+" numOfCustomers "+this.numOfCustomers+" isNewsIsGood "+this.isNewsIsGood;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public int getNumOfCustomers() {
		return numOfCustomers;
	}
	
	public void setNumOfCustomers(int numOfCustomers) {
		this.numOfCustomers = numOfCustomers;
	}
	
	public boolean getIsNewsIsGood() {
		return isNewsIsGood;
	}
	
	public void setIsNewsIsGood(boolean isNewsIsGood) {
		this.isNewsIsGood = isNewsIsGood;
	}
}
