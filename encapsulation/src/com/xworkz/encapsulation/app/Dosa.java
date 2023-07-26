package com.xworkz.encapsulation.app;

public class Dosa {
	private String type="Plain Dosa";
	private double price;
	private String playaForDosa;
	private String dosaMadeFrom;
	private boolean isDosaTasty;
	
	@Override
	
	public String toString() {
		return "type "+this.type +" price "+ this.price +" playaForDosa "+this.playaForDosa +" dosaMadeFrom "+this.dosaMadeFrom+ "isDosaTasty  "+this.isDosaTasty;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public String getPlayaForDosa() {
		return playaForDosa;
	}
	
	public void setPlayaForDosa(String playaForDosa) {
		this.playaForDosa = playaForDosa;
	}
	
	public String getDosaMadeFrom() {
		return dosaMadeFrom;
	}
	
	public void setDosaMadeFrom(String dosaMadeFrom) {
		this.dosaMadeFrom = dosaMadeFrom;
	}
	
	public boolean getIsDosaTasty() {
		return isDosaTasty;
	}
	
	public void setIsDosaTasty(boolean isDosaTasty) {
		this.isDosaTasty = isDosaTasty;
	}

}
