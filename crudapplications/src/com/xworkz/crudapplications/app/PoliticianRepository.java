package com.xworkz.crudapplications.app;

public interface PoliticianRepository {
	
	int TOTAL_ITEM=5;
	
	

	abstract void save(String politicianName);
	
	default void  display() {
		
	}

}
