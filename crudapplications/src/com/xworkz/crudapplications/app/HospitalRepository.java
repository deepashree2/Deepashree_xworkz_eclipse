package com.xworkz.crudapplications.app;

public interface HospitalRepository {
	
	int TOTAL_NAMES=5;
	
	abstract void save(String hospitalName);
	
	default void dispaly() {
		
	}

}
