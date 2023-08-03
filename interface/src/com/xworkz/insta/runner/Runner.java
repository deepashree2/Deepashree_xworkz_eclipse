package com.xworkz.insta.runner;
import com.xworkz.insta.app.ArmyRules;
import com.xworkz.insta.app.BankCustomers;
import com.xworkz.insta.app.BankRules;
import com.xworkz.insta.app.CompanyRules;
import com.xworkz.insta.app.Customer;
import com.xworkz.insta.app.Daughter;
import com.xworkz.insta.app.Devotee;
import com.xworkz.insta.app.Employee;
import com.xworkz.insta.app.HomeRules;
import com.xworkz.insta.app.HospitalRules;
import com.xworkz.insta.app.HostelRules;
import com.xworkz.insta.app.HotelRules;
import com.xworkz.insta.app.HusbandRules;
import com.xworkz.insta.app.HusbandsWife;
import com.xworkz.insta.app.MetroRules;
import com.xworkz.insta.app.MovieWatchers;
import com.xworkz.insta.app.Patent;
import com.xworkz.insta.app.PatentRules;
import com.xworkz.insta.app.Pub;
import com.xworkz.insta.app.ResOfEmloyeesMetro;
import com.xworkz.insta.app.SaloonRules;
import com.xworkz.insta.app.SaloonStaff;
import com.xworkz.insta.app.StudentsInVTU;
import com.xworkz.insta.app.SurgeryDoctors;
import com.xworkz.insta.app.TempleRules;
import com.xworkz.insta.app.TheratreRules;
import com.xworkz.insta.app.UnderWardenControl;
import com.xworkz.insta.app.VTURules;
import com.xworkz.insta.app.WifeRules;
import com.xworkz.insta.app.WifesHusband;
import com.xworkz.insta.app.resOfHotelEmployee;
import com.xworkz.insta.app.AirFroce;
import com.xworkz.insta.app.AirportPassenger;
import com.xworkz.insta.app.AirpportRules;
public class Runner {

	public static void main(String[] args) {
	
		ArmyRules ref= new AirFroce();
		ref.promotion();
		ref.haircut();
		System.out.println("***************************************");
		
		SaloonRules ref1 = new SaloonStaff();
		System.out.println(ref1.OPEN_TIME);
		ref1.Sanitation();
		ref1.Licensing();
		System.out.println("***************************************");
		
		HostelRules ref2 = new UnderWardenControl();
		ref2.dontWasteFood();
		ref2.dontMess();
		System.out.println(ref2.CLOSING_TIME);
		System.out.println("***************************************");
		
		HospitalRules ref3 = new SurgeryDoctors();
		ref3.hygine();
		ref3.numOfBeds();
		System.out.println(ref3.AVILABLE_TIMINGS);
		System.out.println("***************************************");
		
		MetroRules ref4 = new ResOfEmloyeesMetro();
		ref4.buyToken();
		ref4.getCheck();
		System.out.println(ref4.METRO_CITY);
		System.out.println("***************************************");
		
		HotelRules ref5 = new resOfHotelEmployee();
		ref5.notWashHandInPlate();
		ref5.buyCoin();
		System.out.println(ref5.LOCATION);
		System.out.println("***************************************");
		
		TempleRules ref6 = new Devotee();
		ref6.makeAbishek();
		ref6.washFeets();
		System.out.println(ref6.OPEN_TIME);
		System.out.println("***************************************");
		
		AirpportRules ref7 = new AirportPassenger();
		ref7.bringPassprt();
		ref7.haveVisa();
		System.out.println("Avilability :"+ref7.AVAILABILITY);
		System.out.println("***************************************");
		
		
		TheratreRules ref8 = new MovieWatchers();
		ref8.buyTicket();
		ref8.sitProperSeats();
		System.out.println("Num of shows :"+ref8.NUM_SHOWS);
		System.out.println("***************************************");
		
		
		HomeRules ref9 = new Daughter();
		ref9.switchOffTv();
		ref9.maintainHygine();
		System.out.println("Wake up :"+ref9.WAKE_UP);
		System.out.println("***************************************");
		
		BankRules ref10 = new BankCustomers();
		ref10.bringAccountBook();
		ref10.payInterestOnTime();
		System.out.println("Opening time: "+ref10.OPEN_TIME);
		System.out.println("***************************************");
		
		 
		
		 VTURules ref11 = new StudentsInVTU();
		 ref11.payFee();
		 ref11.writeExam();
		 System.out.println("REG NUM :"+ref11.REG_NUM);
		 System.out.println("***************************************");
		 
		
		 CompanyRules ref12= new Employee();
		 ref12.emailFollowUp();
		 ref12.workFromHome();
		 System.out.println("Opening time :"+ref12.OPENING_TIME);
		 System.out.println("***************************************");
		 
		  
		 Pub ref13 = new Customer();
		 ref13.billPay();
		 ref13.dontFight();
		 System.out.println("Owner name :"+ref13.PUB_OWNER);
		 System.out.println("***************************************");
		 
		
		 HusbandRules ref14 = new HusbandsWife();
		 System.out.println("Is he married :"+ref14.IS_HE_MARRIED);
		 ref14.doNotMakeUp();
		 ref14.doNotFightWithAmma();
		 System.out.println("***************************************");
		 
		 WifeRules ref15 = new WifesHusband();
		 System.out.println("is she married :"+ref15.IS_SHE_MARRIED);
		 ref15.giveTime();
		 ref15.weekendTrip();
		 System.out.println("***************************************");
		 
		 PatentRules ref16 =new Patent();
		 ref16.followTradeMark();
		 ref16.limitedTime();
		 System.out.println("Patent name :"+ref16.PATENT_NAME);
		 
	} 

}
