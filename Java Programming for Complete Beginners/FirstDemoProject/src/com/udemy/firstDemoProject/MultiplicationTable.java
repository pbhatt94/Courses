package com.udemy.firstDemoProject;

public class MultiplicationTable {
	void print() {
		print(5);
	}
	void print(int num) {
		print(num, 1, 10);
	}

	void print(int num, int from, int to) {
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", num, i, num*i).println();
		}
	}
}
