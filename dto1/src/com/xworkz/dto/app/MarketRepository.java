package com.xworkz.dto.app;

import com.xworkz.dto.app.DTO.MarketDTO;

public interface MarketRepository {
		int TOTAL=5;
		void save(MarketDTO market);
		
		MarketDTO findByName(String name);
		
		MarketDTO findByOwner(String owner);
		
		MarketDTO findByOwnerEmial(String ownerEmail);
		
		MarketDTO[] read();
		
		
}
