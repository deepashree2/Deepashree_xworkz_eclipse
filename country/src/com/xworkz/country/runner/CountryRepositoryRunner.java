package com.xworkz.country.runner;

import com.xworkz.country.CountryRepository;
import com.xworkz.country.implement.CountryRepositoryImpl;

public class CountryRepositoryRunner {

	public static void main(String[] args) {

		CountryRepository ref = new CountryRepositoryImpl();
		ref.country("India");
		ref.country("Bhutan");
		ref.country("Indonesia");
		ref.country("Russia");
		ref.country("America");
		ref.country("Nepal");
		ref.country("Japan");
		ref.country("srilanka");
		ref.country("china");
		ref.country("ukarine");
		
		ref.dispaly();
		
		System.out.println(ref.isExist("India"));
		
		System.out.println(ref.findReturnUpperCase("India"));
		
		String[] found = ref.findStartWith("I");
		System.out.println("name start with I");
		for(int i =0; i<found.length;i++) {
			if(found[i] != null) {
				System.out.println(found[i]);
			}
			
		}
		
		
		
		String[] found1=ref.findEndWith("a");
		System.out.println("name end with a");
		for(int i=0; i<found1.length; i++) {
			if(found1[i] != null) {
				System.out.println(found1[i]);
			}
		
		
		}
	}
}


