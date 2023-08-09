package com.xworkz.abstractionpart1.runner;

import com.xworkz.abstractionpart1.abstractioon.Elevator;
import com.xworkz.abstractionpart1.abstractioon.ElevatorImplements;
import com.xworkz.abstractionpart1.abstractioon.Kidney;
import com.xworkz.abstractionpart1.abstractioon.KidneyImplements;
import com.xworkz.abstractionpart1.abstractioon.Laptop;
import com.xworkz.abstractionpart1.abstractioon.PrintMachineImplements;
import com.xworkz.abstractionpart1.abstractioon.PrintingMachine;
import com.xworkz.abstractionpart1.abstractioon.SmartWatch;
import com.xworkz.abstractionpart1.abstractioon.SmartWatchImplements;
import com.xworkz.abstractionpart1.abstractioon.WashingMachine;
import com.xworkz.abstractionpart1.abstractioon.WashingMachineImplements;
import com.xworkz.abstractionpart1.abstractioon.WaterPurifier;
import com.xworkz.abstractionpart1.abstractioon.WaterPurifierImplements;
import com.xworkz.abstractionpart1.user.BhuvanLaptop;
import com.xworkz.abstractionpart1.user.HarshithaElevator;
import com.xworkz.abstractionpart1.user.HemavathiWaterPurifier;
import com.xworkz.abstractionpart1.user.HumanKidney;
import com.xworkz.abstractionpart1.user.KarthikPrintingMachine;
import com.xworkz.abstractionpart1.user.RishabSmartWatch;
import com.xworkz.abstractionpart1.user.ArjunKapoorWashingMachine;

public class Runner {

	public static void main(String[] args) {
		
		Laptop laptop = new LaptopImplements();
		BhuvanLaptop bhuvan =new BhuvanLaptop(laptop);
		bhuvan.windows();
		
		System.out.println("   ");
		
		PrintingMachine printingMachine = new PrintMachineImplements();
		
		KarthikPrintingMachine karthik = new KarthikPrintingMachine(printingMachine);
		karthik.xerox();
		
		System.out.println("   ");
		
		
		SmartWatch smartWatch = new SmartWatchImplements(); 
		
		RishabSmartWatch ref = new RishabSmartWatch(smartWatch);
		ref.wallpaper();
		
		System.out.println("   ");
		
		Elevator elevator = new ElevatorImplements();
		
		HarshithaElevator ref1 = new HarshithaElevator(elevator);
		ref1.wieghtCapcity();
		
		System.out.println("   ");
		
		WashingMachine washingMachine = new WashingMachineImplements();
		
		ArjunKapoorWashingMachine ref2 = new ArjunKapoorWashingMachine(washingMachine);
		ref2.dry();
		
		System.out.println("   ");
		
		WaterPurifier waterPurifier = new WaterPurifierImplements();
		HemavathiWaterPurifier ref3 = new HemavathiWaterPurifier(waterPurifier);
		ref3.waterCapcity();
		
		Kidney kidney = new KidneyImplements();
		HumanKidney ref4 = new HumanKidney(kidney);
		ref4.purify();
	}
	
	

}
