package com.xworkz.abstractionpart1.abstractioon;

public class PrintMachineImplements implements PrintingMachine{

	@Override
	public boolean print() {
		System.out.println("Printing machine will print..");
		return false;
	}

}
