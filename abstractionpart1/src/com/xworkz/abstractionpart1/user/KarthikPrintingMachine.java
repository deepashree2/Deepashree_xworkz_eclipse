package com.xworkz.abstractionpart1.user;

import com.xworkz.abstractionpart1.abstractioon.PrintingMachine;

public class KarthikPrintingMachine {
	
	private PrintingMachine printingMachine;
	
	public KarthikPrintingMachine(PrintingMachine printingMachine) {
		this.printingMachine=printingMachine;
	}
	
	public void xerox() {
		if(printingMachine!=null) {
			System.out.println("with out null it works");
			this.printingMachine.print();
		}
		else {
			System.err.println("with null it can not works");
		}
	}

}
