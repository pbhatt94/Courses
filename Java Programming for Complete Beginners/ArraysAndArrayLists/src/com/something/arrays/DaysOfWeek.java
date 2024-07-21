package com.something.arrays;

public class DaysOfWeek {
	public static void main(String[] args) {
		String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		System.out.println("Days of the week:");
		for (int i = 0; i < daysOfWeek.length; i++) {
			System.out.println(daysOfWeek[i]);
		}

		String dayWithHighestLength = "";
		int highest = 0;
		for (String day : daysOfWeek) {
			if (day.length() > highest) {
				dayWithHighestLength = day;
			}
		}
		System.out.println("Day with Highest Length: " + dayWithHighestLength);
	}
}
