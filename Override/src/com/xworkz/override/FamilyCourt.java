package com.xworkz.override;

public class FamilyCourt extends CivilCourt{
	
	void divorce()
	{
		System.out.println("invoking divorce method in FamilyCourt class..");
	}
	
	@Override
	void justice() {
		System.out.println("overriden justice method in FamilyCourt..");
	}

	@Override
	void importantCase() {
		System.out.println("overriden importantCase in FamilyCourt..");
	}
	
	@Override
	void criminalCase() {
		System.out.println("overriden criminalCase in FamilyCourt..");
	}
	
	@Override
	void forgeryCase() {
		System.out.println("overriden forgeryCase in FamilyCourt..");
	}
	
	@Override
	void propertyCase() {
		System.out.println("overriden propertyCase in FamilyCourt..");
	}
	
	@Override
	void theftCase() {
		System.out.println("overriden theftCase in FamilyCourt..");
	}
}
