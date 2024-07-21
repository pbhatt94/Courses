package com.menuDriven.demo;

import java.util.Scanner;

public class MenuDriven {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2");
		int num2 = sc.nextInt();

		System.out.println("\nChoose the operation:");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");

		System.out.print("Enter your choice (1/2/3/4): ");
		int choice = sc.nextInt();
		performOperationUsingSwitch(num1, num2, choice);
		sc.close();
	}

	private void performOperationUsingIfElse(int num1, int num2, int choice) {
		int result;

		if (choice == 1) {
			result = num1 + num2;
			System.out.println("Result of addition: " + result);
		} else if (choice == 2) {
			result = num1 - num2;
			System.out.println("Result of subtraction: " + result);
		} else if (choice == 3) {
			result = num1 * num2;
			System.out.println("Result of multiplication: " + result);
		} else if (choice == 4) {
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println("Result of division: " + result);
			} else {
				System.out.println("Error: Cannot divide by zero.");
			}
		} else {
			System.out.println("Invalid choice. Please choose a number between 1 and 4.");
		}
	}


	private void performOperationUsingSwitch(int num1, int num2, int choice) {
		int result;
		switch (choice) {
		case 1:
			result = num1 + num2;
			System.out.println("Result of addition: " + result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("Result of subtraction: " + result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("Result of multiplication: " + result);
			break;
		case 4:
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println("Result of division: " + result);
			} else {
				System.out.println("Error: Cannot divide by zero.");
			}
			break;
		default:
			System.out.println("Invalid choice. Please choose a number between 1 and 4.");
			break;
		}
	}
}
