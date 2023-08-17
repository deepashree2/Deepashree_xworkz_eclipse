package com.xworkz.dto.runner;

import java.io.Serializable;

public class PoiletDTO implements Serializable {
	
	private String name;
	private String location;
	private String fatherName;
	private String motherName;
	private boolean married;
	
	public PoiletDTO(){
		
	}

	public PoiletDTO(String name, String location, String fatherName, String motherName, boolean married) {
		super();
		this.name = name;
		this.location = location;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.married = married;
	}

	@Override
	public String toString() {
		return "PoiletDTO [name=" + name + ", location=" + location + ", fatherName=" + fatherName + ", motherName="
				+ motherName + ", married=" + married + "]";
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getFatherName() {
		return fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public boolean isMarried() {
		return married;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
	

}
