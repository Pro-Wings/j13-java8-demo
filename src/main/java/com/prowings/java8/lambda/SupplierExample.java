package com.prowings.java8.lambda;

import java.util.function.Supplier;

public class SupplierExample {
	
	
	public static void main(String[] args) {
		
		
		Supplier<String> applicationName = () -> "My Application";
		
		String appName = applicationName.get();
		
		System.out.println(appName);
		
	}

}
