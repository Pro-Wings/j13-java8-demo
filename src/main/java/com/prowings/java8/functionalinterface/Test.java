package com.prowings.java8.functionalinterface;

public class Test {
	
	public static void main(String[] args) {

		//before java 8
		MyFunctionalInterface mfi = new MyFunctionalInterface() {
			@Override
			public String hello(String name) {
				return "Hello " + name;
			}
		};
        System.out.println("Before Java 8 impl -------- " + mfi.hello("John"));

        //after java 8
		MyFunctionalInterface mfi2 = (name) -> "Hello " + name;
		System.out.println(mfi2.hello("John"));
		
	}

}
