package com.xworkz.crudapplications.app;

public interface ApartmentRepositry {
	
	int TOTAL_NAMES=5;
	
	abstract void create(String apartmentNames);
	
	default void display() {
		
	}

}
