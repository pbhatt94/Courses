package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

	static <X extends List> void duplicate(X list) {
		list.addAll(list);
	}

	static double sumOfNumberList(List<? extends Number> numbers) {
		double sum = 0.0;
		for (Number number : numbers) {
			sum += number.doubleValue();
		}
		return sum;
	}

	static void addTwoValues(List<? super Number> numbers) {
		numbers.add(1);
		numbers.add(1.0);
		numbers.add(1.0f);
		numbers.add(1l);
	}

	public static void main(String[] args) {
		List list1 = new ArrayList<Integer>();
		addTwoValues(list1);
		System.out.println(list1);

		ArrayList<Integer> arr = new ArrayList<>(List.of(1, 2, 3));
		duplicate(arr);
		System.out.println(arr);

		System.out.println(sumOfNumberList(List.of(1, 2, 3, 4)));
		System.out.println(sumOfNumberList(List.of(1.1, 2.1, 3, 4)));
		System.out.println(sumOfNumberList(List.of(1, 2, 3l, 4l)));

		MyCustomList<String> s = new MyCustomList<>();
		s.addElement("first");
		s.addElement("second");
		s.addElement("third");
		System.out.println(s);

		MyCustomList<Integer> list = new MyCustomList<>();
		list.addElement(Integer.valueOf(2));
		list.addElement(Integer.valueOf(3));
		list.addElement(Integer.valueOf(4));
		list.addElement(Integer.valueOf(5));
		System.out.println(list);
	}
}
