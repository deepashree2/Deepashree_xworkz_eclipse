package com.xworkz.dto.app.DTO;

import java.io.Serializable;

public class TheatreDTO implements Serializable{
	private String theatreName;
	private String ownerName;
	private String movieName;
	private boolean movieIsGood;
	private int numWorkers;
	
	public TheatreDTO() {
		
	}
	
	public TheatreDTO(String theatreName, String ownerName, String movieName, boolean movieIsGood, int numWorkers) {
		super();
		this.theatreName = theatreName;
		this.ownerName = ownerName;
		this.movieName = movieName;
		this.movieIsGood = movieIsGood;
		this.numWorkers = numWorkers;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getMovieName() {
		return movieName;
	}

	public boolean isMovieIsGood() {
		return movieIsGood;
	}

	public int getNumWorkers() {
		return numWorkers;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void setMovieIsGood(boolean movieIsGood) {
		this.movieIsGood = movieIsGood;
	}

	public void setNumWorkers(int numWorkers) {
		this.numWorkers = numWorkers;
	}

	@Override
	public String toString() {
		return "TheatreDTO [theatreName=" + theatreName + ", ownerName=" + ownerName + ", movieName=" + movieName
				+ ", movieIsGood=" + movieIsGood + ", numWorkers=" + numWorkers + "]";
	}

	
	
	
}
