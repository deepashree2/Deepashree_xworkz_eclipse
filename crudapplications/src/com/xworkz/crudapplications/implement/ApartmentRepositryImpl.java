package com.xworkz.crudapplications.implement;
import com.xworkz.crudapplications.app.ApartmentRepositry;

public class ApartmentRepositryImpl implements ApartmentRepositry{
	
	private String[] name = new String[TOTAL_NAMES];
	private int index=0;

	@Override
	public void create(String apartmentNames) {
		
		System.out.println("invoking ApartmentRepositryImpl..");
		if(index < TOTAL_NAMES){
			this.name[index]=apartmentNames;
			System.out.println("apartment index: "+index +"apartment name: "+apartmentNames);
			index=index+1;
			System.out.println("index after :"+index);
		}
		else {
			System.out.println("there is no space to store..s");
		}
	}
	
	public void display() {
		for(int start=0; start<TOTAL_NAMES; start++)
		System.out.println("index num"+ start +" apartmentName" + name[start]);
	}

}
