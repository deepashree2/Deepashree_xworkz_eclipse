package com.xworkz.dto.app;

import com.xworkz.dto.app.DTO.TheatreDTO;

public interface TheatreRepository {
	
	int TOTAL=5;
	void save(TheatreDTO theatre);

	TheatreDTO findByTheatreName(String theatreName);
	
	TheatreDTO findByOwnerName(String ownerName);
	
	TheatreDTO findByMovieName(String movieName);
	
	TheatreDTO[] read();
	
}
