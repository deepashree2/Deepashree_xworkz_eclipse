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


	@Override
	public TheatreDTO findByTheatreName(String theatreName) {
		for(int i=0; i<index; i++) {
			if(theatres[i].getTheatreName()==theatreName) {
				System.out.println("data matched");
				return theatres[i];
			}
			System.out.println("data not matched try next one");
		}
		System.out.println("data not mathced");
		return null;
	}


	@Override
	public TheatreDTO findByOwnerName(String ownerName) {
		for(int i=0; i<index; i++) {
			if(theatres[i].getOwnerName()==ownerName) {
				System.out.println("data matched");
				return theatres[i];
			}
			System.out.println("data not matched try next one");
		}
		System.out.println("data not mathced");
		return null;
	}
	


	@Override
	public TheatreDTO findByMovieName(String movieName) {
		for(int i=0; i<index; i++) {
			if(theatres[i].getMovieName()==movieName) {
				System.out.println("data matched");
				return theatres[i];
			}
			System.out.println("data not matched try next one");
		}
		System.out.println("data not mathced");
		return null;
	}


	@Override
	public TheatreDTO[] read() {
		
		return theatres;
	}

}
