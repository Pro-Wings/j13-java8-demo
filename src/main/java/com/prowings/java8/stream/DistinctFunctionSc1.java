package com.prowings.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctFunctionSc1 {
	
	public static void main(String[] args) {
		
		//Find Distinct Words From a List of Sentences
		
		List<String> sentences = Arrays.asList("Hello world", "Java is great", "Java is a programming language",
				"Hello Java");

		List<String> distinctWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Split each sentence into words
                .distinct() // Get distinct words
                .collect(Collectors.toList()); // Collect to a list
		
		System.out.println("Distinct Words: " + distinctWords);
		
		Long count = sentences.stream().flatMap(sentence -> Arrays.stream(sentence.split(" "))) // Split each sentence
				.distinct() // Get distinct words
				.count(); // Count distinct words
		
		System.out.println("Count of Distinct Words: " + count);
	}

}
