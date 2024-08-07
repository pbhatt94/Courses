package com.in28minutes.api.a;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("First Person");
		names.add("Second");
		names.add("Third");

		List<String> copyOfNames = List.copyOf(names);
		// copyOfNames.add("Anything");
		// not allowed -> copyOf returns an immutable collection
		System.out.println(copyOfNames);
	}
}
