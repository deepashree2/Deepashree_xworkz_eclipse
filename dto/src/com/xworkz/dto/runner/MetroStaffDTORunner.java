package com.xworkz.dto.runner;

import com.xworkz.dto.app.MetroStaffRepository;
import com.xworkz.dto.app.MetroStaffRepositoryImpl;
import com.xworkz.dto.app.DTO.MetroStaffDTO;

public class MetroStaffDTORunner {

	public static void main(String[] args) {


		MetroStaffDTO metroStaffDTO = new MetroStaffDTO(1, 24, "bhavya", "jallahalii ", 30000);
		MetroStaffDTO metroStaffDTO1 = new MetroStaffDTO(2, 36, "Navya", "electronic city ", 50000);
		MetroStaffDTO metroStaffDTO2 = new MetroStaffDTO(3, 41, "bahani", "banashankari ", 34000);
		MetroStaffDTO metroStaffDTO3 = new MetroStaffDTO(13, 54, "karunya", "majestic ", 307000);
		MetroStaffDTO metroStaffDTO4 = new MetroStaffDTO(17, 74, "shiva", "8mile ", 90000);
		System.out.println(metroStaffDTO);
		MetroStaffRepository metroStaffRepository=new MetroStaffRepositoryImpl();
		metroStaffRepository.save(metroStaffDTO);
		metroStaffRepository.save(metroStaffDTO1);
		metroStaffRepository.save(metroStaffDTO2);
		metroStaffRepository.save(metroStaffDTO3);
		metroStaffRepository.save(metroStaffDTO4);
		

	}

}
