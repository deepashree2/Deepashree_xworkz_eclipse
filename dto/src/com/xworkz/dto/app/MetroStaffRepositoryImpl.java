package com.xworkz.dto.app;

import com.xworkz.dto.app.DTO.MetroStaffDTO;

public class MetroStaffRepositoryImpl implements MetroStaffRepository{

	private MetroStaffDTO[] staff = new MetroStaffDTO[TOTAL];
	private int index=0;
	@Override
	public void save(MetroStaffDTO metroStaff) {
		System.out.println("invoking MetroStaffRepositoryImpl");
		if(index<TOTAL) {
			this.staff[index]=metroStaff;
			System.out.println("index "+index+" metroStaff "+ staff[index]);
			index++;
			System.out.println("index after :"+index);
		}
		
	}

}
