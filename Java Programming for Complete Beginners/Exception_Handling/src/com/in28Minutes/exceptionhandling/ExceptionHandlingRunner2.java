package com.in28Minutes.exceptionhandling;

public class ExceptionHandlingRunner2 {
	public static void main(String[] args) {
		//		System.out.println("this will execute");
		method1();
		System.out.println("Main Ended");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 ended");
	}

	private static void method2() {
		try {
			//			String str = null;
			//			str.length();
			int[] arr = { 1, 2 };
			int num = arr[3];
			System.out.println("Method2 ended");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
			System.err.println("error occurred ");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.err.println("ArrayIndexOutOfBoundsException ");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
