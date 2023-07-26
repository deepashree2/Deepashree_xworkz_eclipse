package com.xworkz.encapsulation.app;

public class Mixture {
	private String company;
	private int netWeight;
	private String color;
	private boolean isQualityGood;
	private double cost;
	
	public String toString() {
		return "company "+this.company+" netWeight "+this.netWeight+" color "+this.color+" isQualityGood "+this.isQualityGood+" cost "+this.cost;
				
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public int getNetWeight() {
		return netWeight;
	}
	
	public void setNetWeight(int netWeight) {
		this.netWeight = netWeight;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean getIsQualityGood() {
		return isQualityGood;
	}
	
	public void  setIsQualityGood(boolean isQualityGood) {
		this.isQualityGood=isQualityGood;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}

}
