package com.xworkz.abstractionpart1.user;

import com.xworkz.abstractionpart1.abstractioon.WashingMachine;

public class ArjunKapoorWashingMachine {

	private WashingMachine washingMachine;
	
	public ArjunKapoorWashingMachine(WashingMachine washingMachine) {
		this.washingMachine=washingMachine;
	}
	
	public void dry() {
		if(washingMachine!=null) {
			System.out.println("With out null it works");
			this.washingMachine.wash();
		}
		else {
			System.out.println("with null it can not works");
		}
	}
}
