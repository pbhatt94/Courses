package functional_programming;

import java.util.List;

public class FPNumberRunner {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6);
		numbers.stream().forEach(element -> System.out.println(element));

		int sum = fpSum(numbers);
		System.out.println(sum);
	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> {
			System.out.println(number1 + " " + number2);
			return number1 + number2;
		});
	}
}
