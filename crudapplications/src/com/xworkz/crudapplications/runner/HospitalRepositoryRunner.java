package com.xworkz.crudapplications.runner;

import com.xworkz.crudapplications.app.HospitalRepository;
import com.xworkz.crudapplications.implement.HospitalRepositoryImpl;

public class HospitalRepositoryRunner {

	public static void main(String[] args) {
		
		HospitalRepository ref=new HospitalRepositoryImpl();
		ref.save("SSM");
		ref.save("chamarajendra");
		ref.save("Jayadev");
		ref.save("Machine");
		ref.save("Mangala");
		ref.dispaly();

	}

}
