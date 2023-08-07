package com.xworkz.diamondproblemm;

public class Runner {
	
	public static void main(String[] args) {
	
	BiscuitImplentor biscuitImplentor = new BiscuitImplentor();
	biscuitImplentor.biscuitSuplier();
	biscuitImplentor.totalPrice();
	biscuitImplentor.chemicalProperties();

	Britinia britinia =  new BiscuitImplentor();
	britinia.chemicalProperties();
	britinia.totalPrice();
	
	ParleBiscuit parleBiscuit =  new BiscuitImplentor();
	parleBiscuit.chemicalProperties();
	parleBiscuit.biscuitSuplier();
	
	Biscuit biscuit = new BiscuitImplentor();
	biscuit.chemicalProperties();
	
	System.out.println("-------------------------------------------------");
	
	HospitalImplements hospitalImplements = new HospitalImplements();
	hospitalImplements.aboutDoctors();
	hospitalImplements.aboutManagement();
	hospitalImplements.affilatedTo();
	
	MentalHospital mentalHospital =  new HospitalImplements();
	mentalHospital.aboutManagement();
	mentalHospital.affilatedTo();

	DentalHospital dentalHospital = new HospitalImplements();
	dentalHospital.aboutDoctors();
	dentalHospital.aboutManagement();
	
	Hospital hospital =  new HospitalImplements();
	hospital.aboutManagement();
	
	System.out.println("-------------------------------------------------");
	
	BusImplements busImplements = new BusImplements();
	busImplements.BMTC();
	busImplements.cityBus();
	busImplements.KSRTC();

	BangloreBusStand bangloreBusStand = new BusImplements();
	bangloreBusStand.BMTC();
	bangloreBusStand.KSRTC();
	
	HassanBusStand hassanBusStand = new BusImplements();
	hassanBusStand.cityBus();
	hassanBusStand.KSRTC();
	
	BusStand busStand = new BusImplements();
	busStand.KSRTC();
	}
}
