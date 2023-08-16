package com.xworkz.dto.app.DTO;

import java.io.Serializable;

public class CustomerDTO implements Serializable{
	
	private int custId;
	private String custName;
	private String custEmail;
	private String custLocation;
	private boolean married;
	
	public CustomerDTO() {
		
	}
	
	public CustomerDTO(int custId, String custName, String custEmail, String custLocation,boolean married) {
		super();
		this.custId=custId;
		this.custName=custName;
		this.custEmail=custEmail;
		this.custLocation=custLocation;
		this.married=married;
		
	}

	public int getCustId() {
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public String getCustLocation() {
		return custLocation;
	}

	public boolean isMarried() {
		return married;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public void setCustLocation(String custLocation) {
		this.custLocation = custLocation;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "CustomerDTO [custId=" + custId + ", custName=" + custName + ", custEmail=" + custEmail
				+ ", custLocation=" + custLocation + ", married=" + married + "]";
	}
	
	

}
