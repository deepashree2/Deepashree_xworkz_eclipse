package com.xworkz.crudapplications.runner;

import com.xworkz.crudapplications.app.ApartmentRepositry;
import com.xworkz.crudapplications.implement.ApartmentRepositryImpl;

public class ApartmentRepositryRunner {

	public static void main(String[] args) {
		
		ApartmentRepositry ref = new ApartmentRepositryImpl();
		ref.create("Village villas");
		ref.create("Jolly city");
		ref.create("The city block");
		ref.create("sankalpa");
		ref.create("Peace apartment");
		
		ref.display();

	}

}
