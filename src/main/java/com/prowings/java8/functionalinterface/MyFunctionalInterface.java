package com.prowings.java8.functionalinterface;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	//abstract method
//	public int add(int a, int b);

	String hello(String name);
	
	// default method
	default void display() {
		System.out.println("Hello from MyFunctionalInterface");
	}

	// static method
	static void staticMethod() {
		System.out.println("Static method in MyFunctionalInterface");
	}

	String toString();
	
	int hashCode();
	
	
}
