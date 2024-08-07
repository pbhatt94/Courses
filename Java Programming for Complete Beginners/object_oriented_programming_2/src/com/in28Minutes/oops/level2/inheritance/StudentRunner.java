package com.in28Minutes.oops.level2.inheritance;

import java.math.BigDecimal;

public class StudentRunner {
	public static void main(String[] args) {
		//		Student student = new Student("Student1", "student@gmail.com", "3902", "Xyz", 2024);
		Employee employee = new Employee();
		employee.setName("Employee");
		employee.setEmail("employee@gmail.com");
		employee.setSalary(new BigDecimal(1223));
		employee.setEmployerName("Google");
		System.out.println(employee);
	}
}