package com.xworkz.encapsulation.app;

public class Satalite {
	
	private String sataliteName;
	private double totalCost;
	private String direcName;
	private String launchingCountry;
	private String launchingLocation;
	
	public String toString() {
		return "sataliteName "+this.sataliteName +" totalCost "+this.totalCost+" direcName "+this.direcName+" launchingCountry "+this.launchingCountry+" launchingLocation "+this.launchingLocation;
	}
	
	public String getSataliteName() {
		return sataliteName;
	}
	
	public void setSataliteName(String sataliteName) {
		this.sataliteName = sataliteName;
	}
	
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	public String getDirecName() {
		return direcName;
	}
	
	public void setDirecName(String direcName) {
		this.direcName = direcName;
	}
	
	public String getLaunchingCountry() {
		return launchingCountry;
	}
	
	public void setLaunchingCountry(String launchingCountry) {
		this.launchingCountry = launchingCountry;
	}
	
	public String getLaunchingLocation() {
		return launchingLocation;
	}
	
	public void setLaunchingLocation(String launchingLocation) {
		this.launchingLocation = launchingLocation;
	}

}
