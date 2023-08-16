package com.xworkz.country.implement;

import com.xworkz.country.CountryRepository;

public class CountryRepositoryImpl implements CountryRepository{

	private String[] nameCountry = new String[TOTAL_COUNTRY];
	private int index=0;
	@Override
	public void country(String name) {
		System.out.println("invoking country in CountryRepositoryImpl");
		if(index<TOTAL_COUNTRY) {
		this.nameCountry[index]=name;
		System.out.println("country name :"+name+" country index :"+index);
		index=index+1;
		System.out.println("after index num "+index);
		
		}
		else {
			System.err.println("there no space to store");
		}
		
		
	}
	@Override
	public void dispaly() {
		for(int i=0; i<TOTAL_COUNTRY; i++) {
			System.out.println("index num :"+i+" country name :" +nameCountry[i]);
		}
		
	}
	@Override
	public boolean isExist(String name) {
		for(int i=0; i<TOTAL_COUNTRY; i++) {
			if(nameCountry[i]==name) {
				System.out.println(name + "found at"+ i);
				return true;
			}
			else {
				System.err.println("there is no match");
			}
		}
		return false;
		
		
	}
	@Override
	 public String findReturnUpperCase(String countryName) {
		if(isExist(countryName)) {
			return countryName.toUpperCase();
		}
		 return null;
		
		 
	 }
	@Override
	 public String[] findStartWith(String start) {
			String[] pre = new String[TOTAL_COUNTRY];
			int loc=0;
			for(int i=0; i<TOTAL_COUNTRY;i++) {
				if(nameCountry[i].startsWith(start)) {
					pre[loc]=nameCountry[i];
					loc++;
				}
			}
			return pre;
		}
	
	
	
	
	
	@Override 
	public  String[] findEndWith(String end) {
		String[] post=new String[TOTAL_COUNTRY];
		int loc=0;
		for(int i=0; i<TOTAL_COUNTRY; i++) {
			if(nameCountry[i].endsWith(end)) {
				post[loc]=nameCountry[i];
				loc++;
			}
		}
		return post;
	}
	

}
