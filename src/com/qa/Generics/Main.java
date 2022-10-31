package com.qa.Generics;

public class Main {

	public static void main(String[] args) {
		// INTRO
		System.out.println("Title: Generics");
		System.out.println("Author: Peter");
		System.out.println("Description: "
				+ "\n\tThis is an example of how Generics saves us a lot"
				+ " of time and wasteful code."
				+ "\n\tWe are using 2 files here. "
				+ "\n\tBeforehand we were creating a class file for each "
				+ "\n\tType we wanted to Print. "
				+ "\n\tThere was a lot of duplicate code. Not DRY. "
				+ "\n\tT is good!");
		System.out.println("");
		//RUNNERS
		Printer printer = new Printer("BOOOO !");
		System.out.println("Nothing selected in Printer Runner"
				+ "\nNote: There is a Warning in my code as no Type has been selected.\n");
		printer.print();
	
		// PRINTER FOR INTEGERS
		Printer<Integer> integerPrinter = new Printer<>(105687);
		System.out.println("Integer to Print in Printer Runner\n");
		integerPrinter.print();
		System.out.println("");
		
		
		// PRINTER FOR DOUNBLE
		Printer<Double> doublePrinter = new Printer<>(585.007);
		System.out.println("Double to Print in Printer Runner\n");
		doublePrinter.print();
		System.out.println("");
		
		
		// PRINTER FOR STRING
		Printer<String> stringPrinter = new Printer<>("____HEllo WoRlD !!___");
		System.out.println("String to Print in Printer Runner\n");
		stringPrinter.print();
		System.out.println("");
		
		
	}

}
