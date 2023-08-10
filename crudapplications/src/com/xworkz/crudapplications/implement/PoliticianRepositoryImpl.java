package com.xworkz.crudapplications.implement;

import com.xworkz.crudapplications.app.PoliticianRepository;

public class PoliticianRepositoryImpl implements PoliticianRepository{

	private String[] name = new String[TOTAL_ITEM];
	
	private int index=0;

	@Override
	public void save(String politicianName) {
		System.out.println("invoking PoliticianRepositoryImpl...");
		if(index<TOTAL_ITEM) {
			System.out.println("politician name is "+politicianName);
			System.out.println("index number before"+index);
			this.name[index]=politicianName;
			index=index+1;
			System.out.println("index number after"+index);
		}
		else 
		{
			System.err.println("there is no space to store");
		}
	}
	
	public void display() {
		for(int index=0; index<name.length; index++) {
			System.out.println("politician index: "+ index + "politician name: "+ name[index]);
		}
		
		
}
	

}
