package com.xworkz.dto.app;

import com.xworkz.dto.runner.PoiletDTO;

public class PoiletRepositoryImpl implements PoiletRepository {
	
	private PoiletDTO[] markets = new PoiletDTO[TOTAL];
	private int index=0;
	
	@Override
	public void save(PoiletDTO poilet) {
		System.out.println("invoking PoiletRepositoryImpl");
		if(index<TOTAL) {
			this.markets[index]=poilet;
			System.out.println("index :"+index+" market :"+poilet);
			index++;
			System.out.println("index "+index);
		}
		else {
			System.err.println("no space to store");
		}

}

	
		
	}
