package com.xworkz.dto.runner;

import com.xworkz.dto.app.PoiletRepository;
import com.xworkz.dto.app.PoiletRepositoryImpl;

public class PoiletDTORunner {

	public static void main(String[] args) {
		
		PoiletDTO poiletDTO = new PoiletDTO("navya", "mumbai", "kumar", "madhu", false);
		PoiletDTO poiletDTO1 = new PoiletDTO("baveena", "luknow", "vanish", "madhura", false);
		PoiletDTO poiletDTO2 = new PoiletDTO("chahar", "bangalore", "bhvan", "sneha", false);
		PoiletDTO poiletDTO3 = new PoiletDTO("charu", "chenai", "madu", "veda", false);
		PoiletDTO poiletDTO4 = new PoiletDTO("bhommika", "hyderbad", "gagan", "vani", false);
		System.out.println(poiletDTO);
		
		PoiletRepository poiletRepository = new PoiletRepositoryImpl();
		poiletRepository.save(poiletDTO4);
		poiletRepository.save(poiletDTO);
		poiletRepository.save(poiletDTO1);
		poiletRepository.save(poiletDTO2);
		poiletRepository.save(poiletDTO3);
		
		
		PoiletDTO found=poiletRepository.findByName("bhommika");
		System.out.println("found "+found);
		
		PoiletDTO found1=poiletRepository.findByLocation("chenai");
		System.out.println("found1 "+found1);
		
		PoiletDTO found2=poiletRepository.findByMotherName("some");
		System.out.println("found "+found);
		
		PoiletDTO[] read= poiletRepository.read();
		for(int i=0; i<read.length ; i++) {
			if(read[i]!=null) {
				System.out.println(read[i]);
			}
		}
	}

}
