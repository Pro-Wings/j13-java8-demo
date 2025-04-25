package com.prowings.java8.stream.terminal.operations;

import java.util.Arrays;
import java.util.List;

import com.prowings.java8.stream.Employee;

public class TerminalOperationsDemo1 {
	
	public static void main(String[] args) {
		
		List<String> sentences = Arrays.asList("Hello world", "Java is great", "Java is a programming language",
				"Hello Java");
		
		//Demo of forEach()
		
		sentences.stream().forEach(System.out::println);
		
		List<Employee> employees = List.of(
			    new Employee(1, "Vaibhav", 75000),
			    new Employee(2, "Ravi", 60000),
			    new Employee(3, "Neha", 90000)
			);
		
		//print employee whose salary is greater than 70000
		System.out.println("Employees with salary greater than 70000");
		employees.stream().filter(emp -> emp.getSalary() > 70000).forEach(e -> System.out.println(e.getName()));
		
	}

}
