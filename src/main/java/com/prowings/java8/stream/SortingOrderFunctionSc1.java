package com.prowings.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOrderFunctionSc1 {

	public static void main(String[] args) {

		// Sorting Numbers (Natural Order)

		List<Integer> numbers = Arrays.asList(5, 1, 4, 3, 2);

		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedNumbers);
		
		
		
		List<Integer> reverseSortedNumbers = numbers.stream()
				.sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
		
		System.out.println(reverseSortedNumbers);
	}

}
