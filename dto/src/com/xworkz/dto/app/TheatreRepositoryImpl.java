package com.xworkz.dto.app;

import com.xworkz.dto.app.DTO.TheatreDTO;

public class TheatreRepositoryImpl implements TheatreRepository{
	
	private TheatreDTO[] theatres = new TheatreDTO[TOTAL];
	private int index=0;
	

	@Override
	public void save(TheatreDTO theatre) {
		System.out.println("invoking TheatreRepositoryImpl..");
		if(index<TOTAL) {
			this.theatres[index]=theatre;
			System.out.println("index "+index+ " theatre "+theatre);
			index++;
			System.out.println("index now "+index);
		}
		else {
			System.err.println("there is no space to store");
		}
		
	}

}
