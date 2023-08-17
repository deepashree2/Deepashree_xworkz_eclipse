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
		
		
		MarketRepository marketRepository = new MarketRepositoryImls();
		
		marketRepository.save(marketDTO);
		marketRepository.save(marketDTO1);
		marketRepository.save(marketDTO2);
		marketRepository.save(marketDTO3);
		marketRepository.save(marketDTO4);
		System.out.println("------------------------");
		MarketDTO found =marketRepository.findByName("dharwad market");
		System.out.println(found);
		
		System.out.println("------------------------");
		MarketDTO found1 =marketRepository.findByOwner("naveena");
		System.out.println(found1);
		
		System.out.println("------------------------");
		MarketDTO found2 =marketRepository.findByOwnerEmial("nandan@gmail.com");
		System.out.println(found2);
		
		System.out.println("------------------------");
		MarketDTO[] read=marketRepository.read();
		for(int i=0; i<read.length; i++) {
			if(read[i]!=null) {
				System.out.println(read[i]);
			}
		}
		}

}
