package com.xworkz.crudapplications.implement;

import com.xworkz.crudapplications.app.OlymplicRepository;

public class OlymplicRepositoryImpl implements OlymplicRepository{

	private int[] year = new int[TOTAL_RECORDS];
	
	private int index=0;
	@Override
	public void save(int olympicYear) {
		System.out.println("invoking OlymplicRepositoryImpl..");
		if(index<TOTAL_RECORDS) {
			this.year[index]=olympicYear;
			System.out.println("index num :"+ index + "olympic year :"+olympicYear);
			System.out.println("index number before :"+index);
			index=index+1;
			System.out.println("index number after :"+index);
			}
		else {
			System.err.println("there is no space to store..");
		}
		
	}
	public void display() {
		for (int start=0; start<year.length; start++) {
			System.out.println("index num : "+start+ "Olympic year :"+year[start]);
		}
	}

}
