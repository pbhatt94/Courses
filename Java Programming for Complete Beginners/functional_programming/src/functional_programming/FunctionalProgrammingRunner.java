package functional_programming;

import java.util.List;

public class FunctionalProgrammingRunner {

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}

	private static void printWithFPWithFiltering(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
	}

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		//		printWithFP(list);
		printWithFPWithFiltering(list);
	}
}
