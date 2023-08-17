package com.xworkz.dto.app;

import com.xworkz.dto.runner.PoiletDTO;

public class PoiletRepositoryImpl implements PoiletRepository {
	
	private PoiletDTO[] poilets = new PoiletDTO[TOTAL];
	private int index=0;
	
	@Override
	public void save(PoiletDTO poilet) {
		System.out.println("invoking PoiletRepositoryImpl");
		if(index<TOTAL) {
			this.poilets[index]=poilet;
			System.out.println("index :"+index+" market :"+poilet);
			index++;
			System.out.println("index "+index);
		}
		else {
			System.err.println("no space to store");
		}

}

	@Override
	public PoiletDTO findByName(String name) {
		for(int i=0; i<index; i++) {
			if(poilets[i].getName()==name) {
				System.out.println("data matched");
				return poilets[i]; 
			}
			System.out.println("data not matched try next one");
		}
		System.out.println("data not matched");
		return null;
	}

	@Override
	public PoiletDTO findByLocation(String location) {
		for(int i=0; i<index; i++) {
			if(poilets[i].getLocation()==location) {
				System.out.println("data matched");
				return poilets[i]; 
			}
			System.out.println("data not matched try next one");
		}
		System.out.println("data not matched");
		return null;
	}

	@Override
	public PoiletDTO findByMotherName(String motherName) {
		for(int i=0; i<index; i++) {
			if(poilets[i].getMotherName()==motherName) {
				System.out.println("data matched");
				return poilets[i]; 
			}
			System.out.println("data not matched try next one");
		}
		System.out.println("data not matched");
		return null;
	}
	@Override
	public PoiletDTO[] read() {
		
		return poilets;
	}

	
		
	}
