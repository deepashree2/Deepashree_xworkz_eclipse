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
	
}
