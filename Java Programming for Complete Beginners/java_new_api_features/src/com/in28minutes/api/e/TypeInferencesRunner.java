package com.in28minutes.api.e;

import java.util.List;

public class TypeInferencesRunner {
	public static void main(String[] args) {
		List<String> names = List.of("1", "2");
		List<String> names2 = List.of("3", "4");
		//		List<List<String>> n = List.of(names, names2);
		var n = List.of(names, names2);
		System.out.println(n);
	}
}
