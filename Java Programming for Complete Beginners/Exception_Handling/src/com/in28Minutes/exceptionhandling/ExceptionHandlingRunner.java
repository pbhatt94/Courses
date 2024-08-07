package com.in28Minutes.exceptionhandling;

public class ExceptionHandlingRunner {
	public static void main(String[] args) {
		System.out.println("this will execute");
		method1();
		System.out.println("this won't");
	}

	private static void method1() {
		method2();
	}

	private static void method2() {
		String str = null;
		str.length();
	}
}
