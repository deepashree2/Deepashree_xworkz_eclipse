package com.xworkz.encapsulation.app;

public class Helmet {
	
	private String company;
	private int weight;
	private String color;
	private int size;
	private double cost;
	
	public String toString() {
		return "company "+ this.company+ " weight "+this.weight+" color "+this.color+" size "+this.size+ " cost "+ this.cost;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public double getCost() {
		return cost;
	}
	
	public void setCost(double cost) {
		this.cost = cost;
	}
}
