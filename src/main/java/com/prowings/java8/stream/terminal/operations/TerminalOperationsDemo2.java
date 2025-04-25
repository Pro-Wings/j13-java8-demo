package com.prowings.java8.stream.terminal.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.prowings.java8.stream.Employee;

public class TerminalOperationsDemo2 {
	
	public static void main(String[] args) {
		
		List<String> sentences = Arrays.asList("Hello world", "Java is great", "Java is a programming language",
				"Hello Java");

		//Demo of collect()
		
		String[] words = {"aaa", "bbb", "aaa" ,"ccc", "ddd", "eee", "fff","ddd", "bbb"};
		
		List<String> wordsList = Arrays.stream(words).collect(Collectors.toList());
		
		System.out.println("Words List - "+wordsList);
		
		List<String> uniqueWordsList = Arrays.stream(words).distinct().collect(Collectors.toList());
		
		
		//Demo of collect() with toSet()
		List<Employee> employees = List.of(
			    new Employee(1, "Vaibhav", 75000),
			    new Employee(2, "Ravi", 60000),
			    new Employee(3, "Ravi Shastri", 60000),
			    new Employee(4, "Neha", 90000)
			);

		Set<Employee> uniqueEmployees = employees.stream().collect(Collectors.toSet());
		
		System.out.println("-------Unique Employees - "+uniqueEmployees);
		
		//Demo of toMap()
		
		// Collecting to a Map with Employee ID as key and Employee name as value
		
		Map<Integer, String> empMap = employees.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));

		Map<Integer, Employee> empMap2 = employees.stream().collect(Collectors.toMap(Employee::getId, emp -> emp )); 
		
		System.out.println("-------Employee Map - "+empMap);
		System.out.println("-------Employee Map2 - "+empMap2);
		
		//Demo of toArray()
		String[] uniqueWords = Arrays.stream(words).distinct().toArray(String[]::new);
		
		//Demo of joining()
		Map<Double, List<Employee>> grouped = employees.stream()
			    .collect(Collectors.groupingBy(Employee::getSalary));
		
		System.out.println("-------Grouped Employees by salary - "+grouped);
		
		//Count Employees in Each Salary Bracket
		Map<Double, Long> countBySalary = employees.stream()
			    .collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));
		
		System.out.println("-------Count Employees by salary - "+countBySalary);
		
		//Join all names of employee with Comma
		String names = employees.stream()
				.map(Employee::getName)
				.collect(Collectors.joining(", "));
		
		System.out.println("-------Employee Names - "+names);
		
		//summingInt() demo
		
		double totalSalary = employees.stream()
				.collect(Collectors.summingDouble(Employee::getSalary)); 
		
		System.out.println("-------Total Employee's Salary - "+totalSalary);
		
		//total salary of employees group by salary
		
		Map<Double, Double> totalSalaryByGroup = employees.stream()
				.collect(Collectors.groupingBy(Employee::getSalary, Collectors.summingDouble(Employee::getSalary)));
		
		System.out.println("-------Total Salary by Group - "+totalSalaryByGroup);
	}

}
