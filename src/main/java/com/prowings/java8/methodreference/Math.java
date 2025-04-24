package com.prowings.java8.methodreference;

public class Math {
	
	int a;

	public Math() {
		System.out.println("Math class constructor called");
	}

	
	
	public Math(int a) {
		super();
		System.out.println("Math class all arg constructor called");
		this.a = a;
	}



	public static int square(int a) {
		return a * a;
	}

	public int squareOfNumber(int a) {
		return a * a;
	}
	
	
	public static int add(int a, int b) {
		return a + b;
	}

	public int substraction(int a, int b) {
		return a - b;
	}
	

}
