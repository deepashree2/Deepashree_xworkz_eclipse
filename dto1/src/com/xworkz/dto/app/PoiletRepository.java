package com.xworkz.dto.app;
import com.xworkz.dto.runner.PoiletDTO;

public interface PoiletRepository {

	
		int TOTAL=5;
		void save(PoiletDTO poilet);
		PoiletDTO findByName(String name);
		PoiletDTO findByLocation(String location);
		PoiletDTO findByMotherName(String motherName);
		PoiletDTO[] read();
}
