package com.xworkz.crudapplications.runner;

import com.xworkz.crudapplications.app.PoliticianRepository;
import com.xworkz.crudapplications.implement.PoliticianRepositoryImpl;

public class PoliticianRepositoryRunner {
	
	public static void main(String[] args) {
		
		PoliticianRepository ref= new PoliticianRepositoryImpl();
		ref.save("Kumarswamy");
		ref.save("Revanna");
		ref.save("HDK");
		ref.save("Modi");
		ref.save("Yogi");
		ref.display();
	}

}
