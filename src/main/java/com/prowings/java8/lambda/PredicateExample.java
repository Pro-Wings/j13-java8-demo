package com.prowings.java8.lambda;

import java.util.function.Predicate;

public class PredicateExample {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isOdd = (Integer n) -> {
			if(n%2 != 0)
				return true;
			else
				return false;
		};
		
		System.out.println(isOdd.test(11));

		Predicate<Integer> isOddShort = (Integer n) -> (n%2 != 0);
		System.out.println(isOddShort.test(11));
		
		
	}

}
