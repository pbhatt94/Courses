package com.in28Minutes.exceptionhandling;

import java.util.Scanner;

public class TryWIthResourcesRunner {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] nums = { 1, 2, 3, 4 };
			int num = nums[21];
		}
	}
}
