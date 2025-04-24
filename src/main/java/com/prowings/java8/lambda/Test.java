package com.prowings.java8.lambda;

public class Test {
	
	public static void main(String[] args) {
		
		//Can not intantiate Interface!!
//		Printer printer = new Printer();

// Way 1 : Create object of Implemented class of interface
		Printer inkjetPrinter = new InkjetPrinter();
		inkjetPrinter.print();
		
//Way 2 : Create object of annonymus implemeted class
		Printer laserPrinter = new Printer() {
			@Override
			public void print() {
				System.out.println("inside print() of LaserPrinter!!");
			}
		};
		laserPrinter.print();

//Way 3 : Lambda Expressions
	Printer thermalPrinter = () -> {
		System.out.println("inside print() of ThermalPrinter!!!");
		System.out.println("inside print() of ThermalPrinter!!!");
		
	};
	thermalPrinter.print();
	}
}
