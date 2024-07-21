package com.switchCaseExample.demo;

public class SwitchCaseExample {

	public void fn(int dayNumber) {
		String weekdayName;

		switch (dayNumber) {
		case 0:
			weekdayName = "Sunday";
			break;
		case 1:
			weekdayName = "Monday";
			break;
		case 2:
			weekdayName = "Tuesday";
			break;
		case 3:
			weekdayName = "Wednesday";
			break;
		case 4:
			weekdayName = "Thursday";
			break;
		case 5:
			weekdayName = "Friday";
			break;
		case 6:
			weekdayName = "Saturday";
			break;
		default:
			weekdayName = "Invalid day number";
			break;
		}

		System.out.println("The weekday corresponding to " + dayNumber + " is: " + weekdayName);
	}
}
