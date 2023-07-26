package com.xworkz.encapsulation.app;

public class Tap {
	
	private String Colour="green";
	private String Taste;
	private String Odour;
	private int Temperature;
	private String Turbidity;
	
	public String toString() {
		return "Colour "+this.Colour+" Taste "+this.Taste+" Odour "+this.Odour+" Temperature "+this.Temperature+" Turbidity "+this.Turbidity;
	}
	
	public String getColour() {
		return Colour;
	}
	
	public void setColour(String colour) {
		Colour = colour;
	}
	
	public String getTaste() {
		return Taste;
	}
	
	public void setTaste(String taste) {
		Taste = taste;
	}
	
	public String getOdour() {
		return Odour;
	}
	
	public void setOdour(String odour) {
		Odour = odour;
	}
	
	public int getTemperature() {
		return Temperature;
	}
	
	public void setTemperature(int temperature) {
		Temperature = temperature;
	}
	
	public String getTurbidity() {
		return Turbidity;
	}
	
	public void setTurbidity(String turbidity) {
		Turbidity = turbidity;
	}

}
