package com.switchCaseExample.demo;

import java.util.Scanner;

public class SwitchCaseExampleRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SwitchCaseExample obj = new SwitchCaseExample();
		System.out.print("Enter a number (0-6) representing the day of the week: ");
		int dayNumber = scanner.nextInt();
		obj.fn(dayNumber);
		scanner.close();
	}

}
