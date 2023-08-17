package com.xworkz.dto.app;

import com.xworkz.dto.app.DTO.CustomerDTO;

public interface CustomerRepository {
	
	int TOTAL_ITEMS=5;
	
	void save(CustomerDTO customer);
	
	CustomerDTO findByCustId(int custId);
	
	CustomerDTO findByCustName(String custName);
	
	CustomerDTO findByCustLocation(String custLocation);
	
	
	CustomerDTO[] read();
}
