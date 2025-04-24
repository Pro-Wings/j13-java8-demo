package com.prowings.java8.optional;

import java.util.Optional;

public class DemoOfOptional {
	
	public static void main(String[] args) {
		
//		Optional<Student> student = getStudentFromDb(10);
//		
//		if (student.isPresent()) {
//			System.out.println("Student found: " + student.get());
//		} else {
//			System.out.println("Student found: " + student.get());
//			System.out.println("Student not found");
//		}
		
		Optional<String> name = Optional.ofNullable(null);

		String result1 = name.orElse("Default");            // Eager: "Default"
		String result2 = name.orElseGet(() -> "Lazy");      // Lazy supplier
		String result3 = name.orElseThrow(() -> new RuntimeException("No name")); // Throws
		
	}

	
	public static Optional<Student> getStudentFromDb(int roll) {
		
		System.out.println("Fetching student from DB with roll number -" + roll + "....");
		
		Student student = null;
//		student.setId(10);
//		student.setName("");
//		student.setAddress("123 Main St");
		
		return Optional.ofNullable(student);
	
	}
	
}
