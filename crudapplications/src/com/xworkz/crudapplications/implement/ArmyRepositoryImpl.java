package com.xworkz.crudapplications.implement;

import com.xworkz.crudapplications.app.ArmyRepository;

public class ArmyRepositoryImpl implements ArmyRepository{

	private String[] name = new String[TOTAL_NAMES];
	
	private int index=0;
	@Override
	public void save(String armyName) {
		System.out.println("invoking ArmyRepositoryImpl..");
		if(index<TOTAL_NAMES) {
			this.name[index]=armyName;
			System.out.println("index value :"+index +" ArmyName :"+armyName);
			System.out.println("index value before "+index);
			index=index+1;
			System.out.println("index value after "+index);
			
			
		}
		else {
			System.err.println("there is no space to store");
		}
		
	}
	
	public void read() {
		for(int start=0; start<TOTAL_NAMES; start++) {
			System.out.println("index num : "+ start + " ArmyName :"+name[start]);
		}
	}
	
	

}
