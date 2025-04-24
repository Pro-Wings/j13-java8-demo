package com.prowings.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctFunctionDemo {
	
	public static void main(String[] args) {
		
		Student s3 = new Student(2, "Ravi");
		Student s4 = new Student(2, "Ravi");
		Student s1 = new Student(1, "Ram");
		
		List<Student> students = Arrays.asList(s1, s3, s4);
		
		List<Student> uniqStudents = students.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Distinct Students - "+uniqStudents);
	}

}
