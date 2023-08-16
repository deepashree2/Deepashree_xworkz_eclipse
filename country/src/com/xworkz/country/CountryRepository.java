package com.xworkz.country;

public interface CountryRepository {
	
	int TOTAL_COUNTRY=10;
	
	abstract void country(String name);
	
    default void dispaly() {
    	
    }

    boolean isExist(String name);
   
   String findReturnUpperCase(String countryName) ;
   
    String[] findStartWith(String start);
   
    String[] findEndWith(String end);
}
