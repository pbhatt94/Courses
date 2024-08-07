package com.in28Minutes.exceptionhandling;

public class CheckedExceptionRunner {
	public static void main(String[] args) {
		try {
			method1();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void method1() throws InterruptedException {
		Thread.sleep(2000);
	}
}
