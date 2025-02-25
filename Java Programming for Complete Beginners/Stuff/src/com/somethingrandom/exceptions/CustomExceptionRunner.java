package com.somethingrandom.exceptions;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String message) {
		super(message);
	}
}

class Person {
	private String name;
	private int age;

	public Person(String name, int age) throws InvalidAgeException {
		if (age < 0 || age > 150)
			throw new InvalidAgeException("Age must be between 0 and 150");
		this.name = name;
		this.age = age;
	}

	public void setAge(int age) throws InvalidAgeException {
		if (age < 0 || age > 150)
			throw new InvalidAgeException("Age must be between 0 and 150");
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class CustomExceptionRunner {
	public static void main(String[] args) {
		try {
			Person person = new Person("Alice", 30);
			person.displayInfo();
			person.setAge(160);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
			System.out.println("Exception: " + e.getMessage());
		}
	}
}

