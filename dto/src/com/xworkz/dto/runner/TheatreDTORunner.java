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
		System.out.println(theatreDTO);
		TheatreRepository theatreRepository=new TheatreRepositoryImpl();
		theatreRepository.save(theatreDTO);
		theatreRepository.save(theatreDTO1);
		theatreRepository.save(theatreDTO2);
		theatreRepository.save(theatreDTO3);
		theatreRepository.save(theatreDTO4);

	}

}
