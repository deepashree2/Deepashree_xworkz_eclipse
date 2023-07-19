package com.xworkz.override;

public class CourtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Court court = new Court();
		court.justice();
		System.out.println(" ");
		
		
		Court court1 = new SupremeCourt();
		SupremeCourt ref = new SupremeCourt();
		ref.importantCase();
		court1.justice();
		System.out.println(" ");
		
		SupremeCourt court2 = new HighCourt();
		HighCourt ref1 = new HighCourt();
		ref1.criminalCase();
		ref1.forgeryCase();
		court2.justice();
		court2.importantCase();
		System.out.println(" ");
		
		HighCourt court3 = new CivilCourt();
		CivilCourt ref2 = new CivilCourt();
		ref2.propertyCase();
		ref2.theftCase();
		court3.justice();
		court3.importantCase();
		court3.criminalCase();
		court3.forgeryCase();
		System.out.println(" ");
		
		CivilCourt court4 = new FamilyCourt();
		FamilyCourt ref3 = new FamilyCourt();
		ref3.divorce();
		court4.justice();
		court4.importantCase();
		court4.criminalCase();
		court4.forgeryCase();
		court4.propertyCase();
		court4.theftCase();
		System.out.println(" ");
		
	}

}
