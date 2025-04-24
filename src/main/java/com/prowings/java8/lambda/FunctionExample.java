package com.prowings.java8.lambda;

import java.util.function.Function;

public class FunctionExample {
	
	public static void main(String[] args) {
		
		Function<String, Integer> getStringLength = (String inputString) ->
		{
			int length = inputString.length();
			return length;
		};
		
		Integer length = getStringLength.apply("hello");
		
		System.out.println(length);
	}

}
