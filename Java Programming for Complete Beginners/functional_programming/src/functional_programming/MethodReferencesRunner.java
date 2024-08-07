package functional_programming;

import java.util.List;

public class MethodReferencesRunner {
	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Egg").stream().map(s -> s.length()).forEach(e -> System.out.println(e));
	}
}
