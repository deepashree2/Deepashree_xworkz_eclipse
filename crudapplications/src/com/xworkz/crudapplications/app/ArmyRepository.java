package com.xworkz.crudapplications.app;

public interface ArmyRepository {
	
	int TOTAL_NAMES=5;
	
	abstract void save(String armyName);
	
	default void read() {
		
	}

}
