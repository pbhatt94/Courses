package com.number.demo;

import java.util.Scanner;

public class MyNumberRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		MyNumber obj = new MyNumber();
		if (obj.isPrime(num)) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		sc.close();
	}
}
