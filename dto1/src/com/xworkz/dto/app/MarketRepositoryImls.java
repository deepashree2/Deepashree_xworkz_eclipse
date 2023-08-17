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

	@Override
	public MarketDTO findByName(String name) {
		for(int i=0; i<index; i++) {
			if(markets[i].getName()==name) {
				System.out.println("found at :"+i);
				return markets[i];
			}
			System.out.println("there is no match check next one");
		}
		System.out.println("data not found");
		return null;
	}

	@Override
	public MarketDTO findByOwner(String owner) {
		for(int i=0; i<index; i++) {
			if(markets[i].getOwner()==owner) {
				System.out.println("found at :"+i);
				return markets[i];
			}
			System.out.println("there is no match check next one");
		}
		System.out.println("data not found");
		return null;
	}

	@Override
	public MarketDTO findByOwnerEmial(String ownerEmail) {
		for(int i=0; i<TOTAL; i++) {
			if(markets[i].getOwnerEmail()==ownerEmail) {
				System.out.println("found at :"+i);
				return markets[i];
			}
			System.out.println("there is no match check next one");
		}
		System.out.println("data not found");
		return null;
	}

	@Override
	public MarketDTO[] read() {
		
		return markets;
	}
	
	

}
