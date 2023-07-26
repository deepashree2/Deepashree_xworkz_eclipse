package com.xworkz.encapsulation.run;

import com.xworkz.encapsulation.app.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) {

		NewsPaper newsPaper = new NewsPaper();
		newsPaper.toString();
		System.out.println(newsPaper);
		newsPaper.setIsNewsIsGood(true);
		System.out.println(newsPaper.getIsNewsIsGood());
		newsPaper.setName("VijayaVaani");
		System.out.println(newsPaper.getName());
		newsPaper.setNumOfCustomers(7989412);
		System.out.println(newsPaper.getNumOfCustomers());
		newsPaper.setOwner("Dr.Vijay Sankeshwar");
		System.out.println(newsPaper.getOwner());
		newsPaper.setPrice(5);
		System.out.println(newsPaper.getPrice());

	}

}
