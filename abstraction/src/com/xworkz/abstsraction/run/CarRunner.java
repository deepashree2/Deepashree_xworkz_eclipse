package com.xworkz.abstsraction.run;

import com.xworkz.abstraction.app.Car;
import com.xworkz.abstraction.app.ElectricCar;
import com.xworkz.abstraction.app.TeslaCar;

public class CarRunner {

	public static void main(String[] args) {
		
		Car teslaCar = new TeslaCar();
		teslaCar.sunRoof();
		teslaCar.gpsNavigation();
		teslaCar.lightWieght();
		teslaCar.carNum();
		
		Car electricCar = new ElectricCar();
		electricCar.sunRoof();
		electricCar.gpsNavigation();
		electricCar.lightWieght();
		electricCar.carNum();

   }
}
