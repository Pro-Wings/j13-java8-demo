package com.prowings.java8.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceDemo {
	
	public static void main(String[] args) {
		
		// Static method call 
		Function<Integer, Integer> squareFunction = (Integer a) -> Math.square(a);
		System.out.println(squareFunction.apply(8) );
		
		// Static method reference
		Function<Integer, Integer> squareFunction2 = Math::square;
		System.out.println(">>>> Using Method reference :"+squareFunction2.apply(8) );
		
		
		BiFunction<Integer, Integer, Integer> addFunction = Math::add;
		System.out.println(">>>> BiFunction Using Method reference :"+addFunction.apply(8, 9) );
		
		
		//Instance method reference
		Math math = new Math();
		Function<Integer, Integer> squareInstanceMethod = math::squareOfNumber;
		System.out.println(">>>> Instance method reference :"+squareInstanceMethod.apply(8) );
		
		BiFunction<Integer, Integer, Integer> substractionFunction = math::substraction;
		System.out.println(">>>> Instance method reference :"+substractionFunction.apply(18, 9) );
		
		
		//3Reference to an Instance Method of an Arbitrary Object of a Particular Type
		Function<String, Integer> stringLengthFunction = String::length;
		System.out.println("Length of String is: "+stringLengthFunction.apply("Hello World") );
		
		Function<String, String> stringUpperCaseFunction = String::toUpperCase;
		System.out.println("Upper case of String is: "+stringUpperCaseFunction.apply("Hello World") );
		
		//Reference to a Constructor
		Supplier<Math> mathSupplier = Math::new;
		Math obj = mathSupplier.get();
		
		Function<Integer, Math> mathConstructorRef = Math::new;
		
		Math mathObj = mathConstructorRef.apply(10);
	}

}
