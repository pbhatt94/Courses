package com.in28minutes.api.f;

public class SwitchExpressionRunner {

	public static String findDayOfTheWeekWithSwitchExpression(int day) {
		String dayOfWeek = switch (day) {
		case 0 -> {
			System.out.println("Complex logic");
			yield "Sunday";
		}
		case 1 -> "Monday";
		default -> throw new IllegalArgumentException("Invalid Option" + day);
		};
		return dayOfWeek;
	}

	public static void main(String[] args) {
		System.out.println(findDayOfTheWeekWithSwitchExpression(1));
	}
}
