package com.xworkz.application;

public class Temple {
		String templeName;
		int since=2008;
		TempleGodName godName;
		String location;
		
		Temple(String templeName, TempleGodName godName){
			
			this.templeName=templeName;
			this.godName=godName;
		}
		

		void method(String location) {
			this.location=location;
		}
		
		void Display() {
			System.out.println("Temple name :"+templeName);
			System.out.println("Temple since :"+since);
			System.out.println("Temple god name :"+godName);
			System.out.println("Temple location :"+location);
		}
		
		
}
