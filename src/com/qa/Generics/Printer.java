package com.qa.Generics;

public class Printer {

	String thingToPrint;
	
	public Printer(String thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		System.out.println("Thing To Print: " + thingToPrint);
	}
}
