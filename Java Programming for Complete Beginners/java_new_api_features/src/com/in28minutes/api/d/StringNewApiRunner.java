package com.in28minutes.api.d;

public class StringNewApiRunner {
	public static void main(String[] args) {
		System.out.println("     ".isBlank());
		System.out.println("    LR ".strip());
		System.out.println("    LR   ".stripLeading());
		System.out.println("    LR   ".stripTrailing());
		"Line1\nLine2\nLine3\n".lines().forEach(System.out::println);
		System.out.println("UPPER".transform(s -> s.substring(2)));
	}
}
