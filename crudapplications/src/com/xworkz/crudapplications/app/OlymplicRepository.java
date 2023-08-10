package com.xworkz.crudapplications.app;

public interface OlymplicRepository {
	
	int TOTAL_RECORDS=5;	
	
	abstract void save(int olympicYear);
	
	default void display() {
		
	}

}
