package com.prowings.java8.stream.terminal.operations;

import java.util.Objects;

public class Student {

	int rollNumber;
	String name;
	String subject;
	double marks;

	public Student(int rollNumber, String name, String subject, double marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.subject = subject;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marks, name, rollNumber, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name) && rollNumber == other.rollNumber
				&& Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", subject=" + subject + ", marks=" + marks
				+ "]";
	}

}
