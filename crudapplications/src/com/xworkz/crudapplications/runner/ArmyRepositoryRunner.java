package com.xworkz.crudapplications.runner;

import com.xworkz.crudapplications.app.ArmyRepository;
import com.xworkz.crudapplications.implement.ArmyRepositoryImpl;

public class ArmyRepositoryRunner {

	public static void main(String[] args) {

		ArmyRepository ref =new ArmyRepositoryImpl();
		ref.save("Navy");
		ref.save("Airforce");
		ref.save("border");
		ref.save("Navy");
		ref.save("Airforce");
		ref.read();

	}

}
