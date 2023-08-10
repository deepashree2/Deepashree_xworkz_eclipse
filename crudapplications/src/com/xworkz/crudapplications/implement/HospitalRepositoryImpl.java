package com.xworkz.crudapplications.implement;

import com.xworkz.crudapplications.app.HospitalRepository;

public class HospitalRepositoryImpl implements HospitalRepository{

	private String[] name = new String[TOTAL_NAMES];
	private int index=0;
	
	@Override
	public void save(String hospitalName) {
		System.out.println("invoking HospitalRepositoryImpl..");
		if(index<TOTAL_NAMES) {
			this.name[index]=hospitalName;
			System.out.println("index value :"+index+" hospitalName: "+hospitalName);
			System.out.println("index value before :"+index);
			index=index+1;
			System.out.println("index value after :"+index);
		}
		else {
			System.err.println("there is no space to store");
		}
		
	}
	
	public void dispaly()
	{
		for(int index=0; index<TOTAL_NAMES; index++) {
			System.out.println("index num :"+ index+ " hospitalName :" + name[index]);
		}
	}

}
