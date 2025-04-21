package com.assignment.task6;

public class Student {
	private String name;
	private int enrollmentNo;
	
	Student(String name, int enrollmentNo){
		this.name = name;
		this.enrollmentNo = enrollmentNo;
	}
	
	
	public String toString() {
		return "Student details - name: " + this.name + 
				" enrollment no: " + this.enrollmentNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Amay", 132);
		System.out.println(student);
	}

}
