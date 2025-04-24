package com.prowings.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOrderFunctionSc3 {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1, "Ravi", 10000);
		Employee e2 = new Employee(2, "Ram", 20000);
		Employee e3 = new Employee(3, "Ajay", 30000);
		
		Employee e4 = new Employee(4, "Sunil", 40000);
		Employee e5 = new Employee(5, "Abhijit", 50000);
		Employee e6 = new Employee(6, "Rajesh", 60000);
		Employee e7 = new Employee(7, "Prashnat", 70000);
		Employee e8 = new Employee(8, "Jaydeep", 80000);
		
		List<Employee> employees = new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);
		employees.add(e7);
		employees.add(e8);
		
		System.out.println("Employees - "+employees);
		
		//Top 3 Salaried Employees
		
		List<Employee> top3SalariedEmployees = employees.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.limit(3)
//				.skip(employees.size() - 3) // Skip the first n-3 elements
				.collect(Collectors.toList());
		
		System.out.println(top3SalariedEmployees);
		
		
		//sort employees by names 
		
		List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.toList());
		
		System.out.println("Sorted Employees By Name - "+sortedEmployees);
		
		//list of employees with salary greater than 30000
		List<Employee> filteredEmployees = employees.stream().filter(e -> e.getSalary() > 30000)
				.collect(Collectors.toList());
		System.out.println("Filtered Employees with salary >30k - "+filteredEmployees);

		//list of employees with salary less than 30000
		List<Employee> filteredEmployees2 = employees.stream().filter(e -> e.getSalary() < 30000)
				.collect(Collectors.toList());
		System.out.println("Filtered Employees with salary <30k - "+filteredEmployees2);
		
		//list of employees with salary between 30000 and 60000
		List<Employee> filteredEmployees3 = employees.stream()
				.filter(e -> e.getSalary() >= 30000 && e.getSalary() <= 60000).collect(Collectors.toList());
		System.out.println("Filtered Employees with salary between 30k and 60k - "+filteredEmployees3);
	}

}
