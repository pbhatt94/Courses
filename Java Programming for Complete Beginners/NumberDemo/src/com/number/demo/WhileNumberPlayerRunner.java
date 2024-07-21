package com.number.demo;

import java.util.Scanner;

public class WhileNumberPlayerRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit");
		int lim = sc.nextInt();
		WhileNumberPlayer obj = new WhileNumberPlayer(lim);
		obj.printSquaresUptoLimit();
		obj.printCubesUptoLimit();
		sc.close();
	}
}
