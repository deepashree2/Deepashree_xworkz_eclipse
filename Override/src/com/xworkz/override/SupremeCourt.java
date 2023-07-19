package com.xworkz.override;

public class SupremeCourt extends Court{
	
	void importantCase()
	{
		System.out.println("invoking importantCase method in SupremeCourt.....");
	}

	@Override
	
	void justice(){
		System.out.println("overiden justice metod in SupremeCourt....");
	}

}
