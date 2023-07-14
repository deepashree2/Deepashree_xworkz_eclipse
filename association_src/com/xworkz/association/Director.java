package com.xworkz.association;

public class Director {
			String name;
			String DOB ="23/04/1994";
			double salary;
			
			Director(){
				System.out.println("Running with no-arg...");
			}
			
			Director(String name, double salary){
				this.name=name;
				this.salary=salary;
			}
			
			void printInfo() {
				System.out.println("Name :"+this.name);
				System.out.println("DOB :"+DOB);
				System.out.println("Salary :"+this.salary);
			}
}
