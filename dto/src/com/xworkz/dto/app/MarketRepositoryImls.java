package com.xworkz.dto.app;

import com.xworkz.dto.app.DTO.MarketDTO;

public class MarketRepositoryImls implements MarketRepository{

	private MarketDTO[] markets = new MarketDTO[TOTAL];
	private int index=0;
	
	@Override
	public void save(MarketDTO market) {
		System.out.println("invoking MarketRepositoryImls");
		if(index<TOTAL) {
			this.markets[index]=market;
			System.out.println("index :"+index+" market :"+market);
			index++;
			System.out.println("index "+index);
		}
		else {
			System.err.println("no space to store");
		}
		
	}

}
