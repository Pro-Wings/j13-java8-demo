package com.prowings.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FatMapDemo {
	
	
	public static void main(String[] args) {
		
		List<List<String>> nested = Arrays.asList(
			    Arrays.asList("a", "b"),
			    Arrays.asList("c", "d")
			);
		
		List<String> flat = nested.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
		
		System.out.println("flattened list - "+flat);
	}

}
