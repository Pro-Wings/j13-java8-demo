package com.prowings.java8.functionalinterface;

@FunctionalInterface
public interface I {
	
	 void m1();
	
	default void m2() {
		System.out.println("inside default m2() method");
	}

	static void m3() {
		System.out.println("inside static m3() method");
	}
}
