package com.xworkz.application;

public class Battery {
		String brand;
		int lightSpeed;
		String color="black";
		BatteryType type;
		
		Battery(String brand, BatteryType type){
			this.brand=brand;
			this.type=type;
			
		}
		
		void method(int lightSpeed) {
			this.lightSpeed=lightSpeed;
		}
		
		void display() {
			System.out.println("Brand :"+brand);
			System.out.println("lightSpeed :"+lightSpeed);
			System.out.println("color :"+color);
			System.out.println("type :"+type);
		}
		
}
