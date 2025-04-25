package com.prowings.java8.stream.terminal.operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.prowings.java8.stream.Employee;

public class TerminalOperationsDemo3 {
	
	public static void main(String[] args) {
		
		List<Student> students = Arrays.asList(
				new Student(1, "Ravi", "Maths", 89.3),
				new Student(2, "Vaibhav", "Maths", 78.3),
				new Student(7, "Viraj", "Maths", 91.3),
				new Student(3, "Neha", "English", 95.3),
				new Student(4, "Ram", "English", 87.3),
				new Student(5, "Vijay", "English", 88.3),
				new Student(6, "Narendra", "Maths", 92.3));
		
		
		//Subject wise student names
		Map<String, List<String>> subjectWiseStudents = students.stream().collect(
				Collectors.groupingBy(Student::getSubject, Collectors.mapping(Student::getName, Collectors.toList())));
		
		System.out.println("Subject wise students - "+subjectWiseStudents);
		
		System.out.println("----------------------------------------------------------");
		//Name of Student wo has second highest marks in Maths
		
		String nameOfSecondHighestStudentInMaths = students.stream()
				.filter(s -> s.getSubject().equals("Maths"))
				.sorted(Comparator.comparing(Student::getMarks).reversed())
				.skip(1).map(Student::getName)
				.findFirst().orElse(null);
		
		System.out.println("Name of student with second highest marks in Maths - "+nameOfSecondHighestStudentInMaths);
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Name of student with second highest marks in Maths - "+nameOfNthHighestStudentInMaths(students, 3));
		
		System.out.println("----------------------------------------------------------");
		
		
	}
	
	
	public static String nameOfNthHighestStudentInMaths(List<Student> students, int n) {
		String nameOfSecondHighestStudentInMaths = students.stream()
				.filter(s -> s.getSubject().equals("Maths"))
				.sorted(Comparator.comparing(Student::getMarks).reversed())
				.skip(n - 1)
				.map(Student::getName)
				.findFirst()
				.orElse("Not found!!");
        return nameOfSecondHighestStudentInMaths;
	}

}
