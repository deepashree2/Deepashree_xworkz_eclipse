package com.xworkz.dto.app.DTO;

import java.io.Serializable;

public class MarketDTO implements Serializable{
	
	private String name;
	private String location;
	private int numOfStores;
	private String owner;
	private String ownerEmail;
	
	public MarketDTO() {
		
	}

	@Override
	public String toString() {
		return "MarketDTO [name=" + name + ", location=" + location + ", numOfStores=" + numOfStores + ", owner="
				+ owner + ", ownerEmail=" + ownerEmail + "]";
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public int getNumOfStores() {
		return numOfStores;
	}

	public String getOwner() {
		return owner;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setNumOfStores(int numOfStores) {
		this.numOfStores = numOfStores;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public MarketDTO(String name, String location, int numOfStores, String owner, String ownerEmail) {
		super();
		this.name = name;
		this.location = location;
		this.numOfStores = numOfStores;
		this.owner = owner;
		this.ownerEmail = ownerEmail;
	}

}
