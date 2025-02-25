package multithreading_work;

import java.util.ArrayList;
import java.util.List;

public class MultithreadWork {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Multi-threaded execution starting...");

		int numThreads = 5;

		List<Thread> threads = new ArrayList<>();

		for (int i = 0; i < numThreads; i++) {
			final int taskNumber = i + 1;
			Runnable task = () -> {
				try {
					System.out.println("Task " + taskNumber + " started");
					Thread.sleep(2000);
					System.out.println("Task " + taskNumber + " completed");
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
					System.err.println("Task " + taskNumber + " interrupted");
				}
			};
			Thread thread = new Thread(task);
			threads.add(thread);
			thread.start();
		}
		//
		//		for (Thread thread : threads) {
		//			thread.start();
		//		}
		try {
			for (Thread thread : threads) {
				thread.join();
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Main thread interrupted");
		}

		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.println("Multi-threaded execution finished: \n Time Taken in M = " + timeTaken);
	}
}








//package multithreading_work;
//
//public class MultithreadWork {
//	public static void main(String[] args) {
//		long startTime = System.currentTimeMillis();
//		System.out.println("Multi-threaded execution starting...");
//
//		Runnable task1 = () -> {
//			try {
//				System.out.println("Task 1 started");
//				Thread.sleep(2000);
//				System.out.println("Task 1 completed");
//			} catch (InterruptedException e) {
//				Thread.currentThread().interrupt();
//				System.err.println("Task 1 interrupted");
//			}
//		};
//
//		Runnable task2 = () -> {
//			try {
//				System.out.println("Task 2 started");
//				Thread.sleep(2000);
//				System.out.println("Task 2 completed");
//			} catch (InterruptedException e) {
//				Thread.currentThread().interrupt();
//				System.err.println("Task 2 interrupted");
//			}
//		};
//
//		Thread thread1 = new Thread(task1);
//		Thread thread2 = new Thread(task2);
//
//		thread1.start();
//		thread2.start();
//
//		try {
//			thread1.join();
//			thread2.join();
//		} catch (InterruptedException e) {
//			Thread.currentThread().interrupt();
//			System.err.println("Main thread interrupted");
//		}
//
//		long endTime = System.currentTimeMillis();
//		long timeTaken = endTime - startTime;
//		System.out.println("Multi-threaded execution finished: \n Time Taken in M = " + timeTaken);
//	}
//}
//
//
