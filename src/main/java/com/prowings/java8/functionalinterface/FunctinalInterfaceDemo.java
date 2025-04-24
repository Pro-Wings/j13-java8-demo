package com.prowings.java8.functionalinterface;

@FunctionalInterface
public interface FunctinalInterfaceDemo {
	
	public void m1();
	
	default void m2()
	{
		System.out.println("inside default m2() method");
	}

	static void m3()
	{
		System.out.println("inside static m3() method");
	}
	
	public String toString();

}
