package com.qa.Generics;

public class Printer <T> {

	T thingToPrint;
	
	public Printer(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		System.out.println("T To Print: " + thingToPrint);
		System.out.println("");
	}
}
