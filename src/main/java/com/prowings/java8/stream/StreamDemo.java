package com.prowings.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("Ram");
		names.add("Sham");
		names.add("Sachin");
		names.add("Ravi");
		
//		//Step 1 - Obtain Stream Object from Group of data/objects 
//		Stream<String> nameStream = names.stream();
//		//step 2 - Perform Intermediate operations
//		nameStream.filter(s -> s.startsWith("R")); 
//		//step 3 - draw final result - using terminal operations.
//		List<String> result = nameStream.collect(Collectors.toList());
		
//		List<String> result = names.stream()
//				.filter(s -> s.startsWith("R"))
//				.map(String::toUpperCase)
//				.collect(Collectors.toList());
//		System.out.println("Filtered Names = "+ result);
		

		List<String> result =names.stream()
	     .filter(n -> {
	         System.out.println(n); // Won’t print anything
	         return n.startsWith("S");
	     }).collect(Collectors.toList());
		System.out.println("Filtered Names = "+ result);
		
		
		Integer[] nums = {10,5,7,12,8,6,3};
		List<Integer> numbers = Arrays.asList(nums);
		
		List<Integer> evenNumbers = numbers.stream().filter(n -> n%2==0).collect(Collectors.toList());
		
		System.out.println("Even numbers" +evenNumbers );
	}

}
