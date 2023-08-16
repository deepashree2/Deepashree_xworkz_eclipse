package com.xworkz.dto.runner;

import com.xworkz.dto.app.MarketRepository;
import com.xworkz.dto.app.MarketRepositoryImls;
import com.xworkz.dto.app.DTO.MarketDTO;

public class MarketDTORunner {

	public static void main(String[] args) {
		
		MarketDTO marketDTO = new MarketDTO("hasssan market", "hassan",5, "navya", "navya@gmail.com");
		MarketDTO marketDTO1 = new MarketDTO("bangalore market", "bangalore",19, "kumar", "kumar@gmail.com");
		MarketDTO marketDTO2 = new MarketDTO("mysore market", "mysore",90, "divya", "divya@gmail.com");
		MarketDTO marketDTO3 = new MarketDTO("belgum market", "belgum",15, "naveena", "naveena@gmail.com");
		MarketDTO marketDTO4 = new MarketDTO("dharwad market", "dharwad",50, "nandan", "nandan@gmail.com");
		System.out.println(marketDTO);
		
		MarketRepository marketRepository = new MarketRepositoryImls();
		marketRepository.save(marketDTO4);
		marketRepository.save(marketDTO);
		marketRepository.save(marketDTO1);
		marketRepository.save(marketDTO2);
		marketRepository.save(marketDTO3);

	}

}
