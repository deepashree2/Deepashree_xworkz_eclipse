package com.xworkz.abstractionpart1.user;

import com.xworkz.abstractionpart1.abstractioon.SmartWatch;

public class RishabSmartWatch {
	
	private SmartWatch smartWatch;
	
	public RishabSmartWatch(SmartWatch smartWatch) {
		this.smartWatch=smartWatch;
	}
	
	public void wallpaper() {
		if(smartWatch!=null) {
			System.out.println("with out null it works..");
			this.smartWatch.showTime();
		}
		else {
			System.out.println("with null it can not work..");
		}
	}

}
