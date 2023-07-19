package com.xworkz.override;

public class CivilCourt extends HighCourt{
	
	void propertyCase()
	{
		System.out.println("invoking propertyCase method in CivilCourt class");
	}
	
	void theftCase()
	{
		System.out.println("invoking theftCase method in CivilCourt class");
	}

	@Override
	
	void justice() {
		System.out.println("overriden justice method in CivilCourt..");
	}
	
	@Override
	
	void importantCase() {
		System.out.println("overriden importantCase method in CivilCourt ..");
	}
	
	@Override
	
	void criminalCase()
	{
		System.out.println("overriden criminalCase method in CivilCourt..");
	}
	
	@Override
	
	void forgeryCase() {
		System.out.println("overriden forgeryCase method in CivilCourt..");
	}
}
