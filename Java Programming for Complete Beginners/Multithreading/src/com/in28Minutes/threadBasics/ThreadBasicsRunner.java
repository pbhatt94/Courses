package com.in28Minutes.threadBasics;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.println("\nTask1 Started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.println("\nTask2 Started");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Done");
	}

}

public class ThreadBasicsRunner {
	public static void main(String[] args) throws InterruptedException {
		System.out.print("Task1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(10);
		task1.start();

		System.out.print("Task2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();

		// wait for task 1 to complete
		task1.join();

		System.out.print("Task3 Kicked Off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Done");
		System.out.println("Main Done");
	}
}
