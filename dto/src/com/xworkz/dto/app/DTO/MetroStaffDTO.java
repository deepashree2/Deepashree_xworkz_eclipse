package com.xworkz.dto.app.DTO;

import java.io.Serializable;

public class MetroStaffDTO implements Serializable{
	
	private int staffId;
	private int numStaff;
	private String staffName;
	private String staffWorkinglocation;
	private int staffSalary;
	
	
	public MetroStaffDTO() {
		
	}


	public MetroStaffDTO(int staffId, int numStaff, String staffName, String staffWorkinglocation, int staffSalary) {
		super();
		this.staffId = staffId;
		this.numStaff = numStaff;
		this.staffName = staffName;
		this.staffWorkinglocation = staffWorkinglocation;
		this.staffSalary = staffSalary;
	}


	public int getStaffId() {
		return staffId;
	}


	public int getNumStaff() {
		return numStaff;
	}


	public String getStaffName() {
		return staffName;
	}


	public String getStaffWorkinglocation() {
		return staffWorkinglocation;
	}


	public int getStaffSalary() {
		return staffSalary;
	}


	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}


	public void setNumStaff(int numStaff) {
		this.numStaff = numStaff;
	}


	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}


	public void setStaffWorkinglocation(String staffWorkinglocation) {
		this.staffWorkinglocation = staffWorkinglocation;
	}


	public void setStaffSalary(int staffSalary) {
		this.staffSalary = staffSalary;
	}


	@Override
	public String toString() {
		return "MetroStaffDTO [staffId=" + staffId + ", numStaff=" + numStaff + ", staffName=" + staffName
				+ ", staffWorkinglocation=" + staffWorkinglocation + ", staffSalary=" + staffSalary + "]";
	}
	
	

}
