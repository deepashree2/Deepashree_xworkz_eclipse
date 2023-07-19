package com.xworkz.override;

public class HighCourt extends SupremeCourt{
	
	void criminalCase() {
		System.out.println("invoking criminalCase method in HighCourt class");
	}
	
	void forgeryCase()
	{
		System.out.println("invoking forgeryCase method in HighCourt class");
	}
	
	@Override
	
	void justice() {
		System.out.println("overideen justice method in HighCourt");
	}
	
	@Override
	
	void importantCase()
	{
		System.out.println("overriden importantCase method in HighCourt..");
	}

}
