package com.something.arrays;

public class StudentRunner {

	public static void main(String[] args) {
		//		int[] marks = { 92, 93, 95 };
		Student student = new Student("Person", 92, 93, 95);
		System.out.println("Number of Marks: " + student.getNumberOfMarks());
		System.out.println("Sum of Marks: " + student.getTotalSumOfMarks());
		System.out.println("Average of Marks: " + student.getAverageMarks());
		System.out.println("Highest Marks: " + student.getMaxMark());

		student.addNewMark(99);

		System.out.println(student);

		student.removeMark(1);

		System.out.println(student);
	}

}
