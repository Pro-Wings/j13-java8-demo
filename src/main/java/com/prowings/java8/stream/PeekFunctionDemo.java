package com.prowings.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekFunctionDemo {
	
	public static void main(String[] args) {
		
		//peek() is an intermediate operation that allows you to debug/inspect the elements of a stream as they are processed. (Mostly we use it for printing/logging purpose)
		// It does not modify the elements of the stream.
		
		// Example: Using peek() to print elements of a stream
		
		List<String> names = Arrays.asList("Vaibhav", "Neha", "Ravikumar", "Ravi", "Shyam", "Ajay", "Ankita", "Amit", "Vikram", "Vikas", "Vishal");

		List<String> result = names.stream()
		    .filter(name -> name.length() > 4)
		    .peek(name -> System.out.println("Filtered: " + name))  // logs after filter
		    .map(String::toUpperCase)
		    .peek(name -> System.out.println("Mapped: " + name))    // logs after map
		    .collect(Collectors.toList());
		
		System.out.println("Result: " + result);
		
	}

}
