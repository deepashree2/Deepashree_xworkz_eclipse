package com.xworkz.dto.runner;

import com.xworkz.dto.app.CustomerDTOImpl;
import com.xworkz.dto.app.CustomerRepository;
import com.xworkz.dto.app.DTO.CustomerDTO;

public class CustomerDTORunnner {

	public static void main(String[] args) {
		
		CustomerDTO customerDTO = new CustomerDTO(1001, "nayan", "nayan@gmail.com","bengaluru",false);
		CustomerDTO customerDTO1 = new CustomerDTO(1002, "kumar", "kumar@gmail.com","yashwanthapura",true);
		CustomerDTO customerDTO2 = new CustomerDTO(1003, "jameer", "jameer@gmail.com","hassan",false);
		CustomerDTO customerDTO3 = new CustomerDTO(1004, "nandini", "nandini@gmail.com","mysore",true);
		CustomerDTO customerDTO4 = new CustomerDTO(1005, "bravo", "bravo@gmail.com","West indies",true);
		System.out.println(customerDTO);
		CustomerRepository customerRepository = new CustomerDTOImpl();
		customerRepository.save(customerDTO);
		customerRepository.save(customerDTO1);
		customerRepository.save(customerDTO2);
		customerRepository.save(customerDTO3);
		customerRepository.save(customerDTO4);
		
	}

}
