package com.xworkz.dto.app;

import com.xworkz.dto.app.DTO.CustomerDTO;

public class CustomerDTOImpl implements CustomerRepository{
	
	

	private CustomerDTO[] customers = new CustomerDTO[TOTAL_ITEMS];
	private int index=0;
	@Override
	public void save(CustomerDTO customer) {
		System.out.println("invoking CustomerDTOImpl..");
		if(index<TOTAL_ITEMS) {
			this.customers[index]=customer;
			System.out.println("index "+ index +" customer "+customer);
			index=index+1;
			System.out.println("index now :"+index);
		}
		else {
			System.out.println("there is no space to store..");
		}
		
	}
	@Override
	public CustomerDTO findByCustId(int custId) {
		
		for(int i=0; i<index; i++) {
		if(customers[i].getCustId() == custId) {
			System.out.println("found at "+ i);
			return customers[i];
		}
		System.out.println("data not matched check next one");
		
		}
		System.out.println("Data not found");
		return null;
	}
	@Override
	public CustomerDTO findByCustName(String custName) {
		for(int i=0; i<index; i++) {
			if(customers[i].getCustName() == custName) {
				System.out.println("found at "+i);
				return customers[i];
			}
			System.out.println("data not matched check next one");
		}
		System.out.println("Data not found");
		return null;
	}
	@Override
	public CustomerDTO findByCustLocation(String custLocation) {
		for(int i=0; i<index; i++) {
			if(customers[i].getCustLocation() == custLocation) {
				System.out.println("found at "+i);
				return customers[i];
			}
			System.out.println("data not matched check next one");
		}
		System.out.println("Data not found");
		return null;
	}
	
	@Override
	public CustomerDTO[] read() {
		
		return customers;
	}
	
	
	
	
}
