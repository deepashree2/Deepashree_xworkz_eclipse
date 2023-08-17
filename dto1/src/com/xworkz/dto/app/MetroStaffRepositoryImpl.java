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
	@Override
	public MetroStaffDTO findByStaffName(String staffName) {
		for(int i=0; i<index; i++) {
			if(staff[i].getStaffName()==staffName) {
				System.out.println("data matched");
				return staff[i];
			}
			System.out.println("data is not matched check next one");
		}
		System.out.println("data not found");
		return null;
	}
	@Override
	public MetroStaffDTO findByStaffSalary(int staffSalary) {
		for(int i=0; i<index; i++) {
			if(staff[i].getStaffSalary()==staffSalary) {
				System.out.println("data matched");
				return staff[i];
			}
			System.out.println("data is not matched check next one");
		}
		System.out.println("data not found");
		return null;
	}
	@Override
	public MetroStaffDTO findByStaffWorkinglocation(String staffWorkinglocation) {
		for(int i=0; i<index; i++) {
			if(staff[i].getStaffWorkinglocation()==staffWorkinglocation) {
				System.out.println("data matched");
				return staff[i];
			}
			System.out.println("data is not matched check next one");
		}
		System.out.println("data not found");
		return null;
	}
	@Override
	public MetroStaffDTO[] read() {
		
		return staff;
	}

}
