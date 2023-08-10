package com.xworkz.crudapplications.runner;

import com.xworkz.crudapplications.app.OlymplicRepository;
import com.xworkz.crudapplications.implement.OlymplicRepositoryImpl;

public class OlymplicRepositoryRunner {

	public static void main(String[] args) {
		
		OlymplicRepository ref = new OlymplicRepositoryImpl();
		ref.save(2001);
		ref.save(2013);
		ref.save(1994);
		ref.save(1990);
		ref.save(2002);
		ref.display();
	}

}
