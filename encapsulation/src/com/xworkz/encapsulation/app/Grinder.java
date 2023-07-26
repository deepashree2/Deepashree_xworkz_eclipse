package com.xworkz.encapsulation.app;

public class Grinder {
	
	private String name;
	private int weight;
	private String type;
	private int capcity;
	private int rpm;
	
	public String toString() {
		return "name "+this.name+" weight "+this.weight+" type "+this.type+" capcity "+this.capcity+" rpm "+this.rpm;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public int getCapcity() {
		return capcity;
	}
	
	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}
	
	public int getRpm() {
		return rpm;
	}
	
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

}
