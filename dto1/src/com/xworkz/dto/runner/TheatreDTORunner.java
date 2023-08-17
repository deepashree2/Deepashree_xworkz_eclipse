package com.xworkz.dto.runner;

import com.xworkz.dto.app.TheatreRepository;
import com.xworkz.dto.app.TheatreRepositoryImpl;
import com.xworkz.dto.app.DTO.TheatreDTO;

public class TheatreDTORunner {

	public static void main(String[] args) {


		TheatreDTO theatreDTO = new TheatreDTO("SBG", "narayan", "KGF", true, 7);
		TheatreDTO theatreDTO1 = new TheatreDTO("sayadri", "moun", "googly", true, 7);
		TheatreDTO theatreDTO2 = new TheatreDTO("bhanu", "sharan", "KGF 2", true, 7);
		TheatreDTO theatreDTO3 = new TheatreDTO("guru", "karthik", "kantahra", true, 7);
		TheatreDTO theatreDTO4 = new TheatreDTO("orion", "Kumar", "HHB", true, 7);
		
		TheatreRepository theatreRepository=new TheatreRepositoryImpl();
		theatreRepository.save(theatreDTO);
		theatreRepository.save(theatreDTO1);
		theatreRepository.save(theatreDTO2);
		theatreRepository.save(theatreDTO3);
		theatreRepository.save(theatreDTO4);
		
		TheatreDTO found=theatreRepository.findByTheatreName("guru");
		System.out.println("found "+found);
		
		TheatreDTO found1=theatreRepository.findByOwnerName("moun");
		System.out.println("found1 "+found1);
		
		TheatreDTO found2=theatreRepository.findByMovieName("HHB");
		System.out.println("found2 "+found2);
		
		TheatreDTO[] read = theatreRepository.read();
		for(int i=0; i<read.length ; i++) {
			if(read[i]!=null) {
				System.out.println(read[i]);
			}
		}
	}

}
