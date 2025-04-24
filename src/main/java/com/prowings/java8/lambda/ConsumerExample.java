package com.prowings.java8.lambda;

import java.util.function.Consumer;

public class ConsumerExample {
	
	public static void main(String[] args) {
		
//		Consumer<Integer> numberConsumer2 = (Integer n) -> System.out.println("input received is - "+n);
//		numberConsumer2.accept(10);
		
		
		Consumer<Integer> printEvenNumbers = (Integer n) -> {
			
			if(n%2==0)
				System.out.println("Its even number!!! --- "+ n);
			else
				System.out.println("Its not even so not printing!!");
			
		};
		
		printEvenNumbers.accept(11);
	}

}
