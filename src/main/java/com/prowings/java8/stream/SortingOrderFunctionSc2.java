package com.prowings.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOrderFunctionSc2 {

	public static void main(String[] args) {
		
		Student s3 = new Student(1, "Abhijit");
		Student s4 = new Student(2, "Ram");
		Student s1 = new Student(3, "Sunil");
		
		List<Student> students = new ArrayList<>();
		students.add(s4);
		students.add(s1);
		students.add(s3);
		
		System.out.println(students);
		
		// Sorting Students By rollnumber
		
		List<Student> sortedStudents = students.stream().sorted(Comparator.comparing(Student::getRoll))
				.collect(Collectors.toList());
		
		System.out.println("Sorted Students By Roll Number - "+sortedStudents);
		
	}

}
