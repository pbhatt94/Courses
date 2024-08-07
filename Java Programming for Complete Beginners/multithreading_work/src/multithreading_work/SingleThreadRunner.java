package multithreading_work;

public class SingleThreadRunner {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Single-threaded execution starting... ");

		try {
			System.out.println("Task 1 started");
			Thread.sleep(2000); // 2 seconds sleep
			System.out.println("Task 1 completed");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Task 1 interrupted");
		}

		try {
			System.out.println("Task 2 started");
			Thread.sleep(2000); // 2 seconds sleep
			System.out.println("Task 2 completed");
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Task 2 interrupted");
		}

		long endTime = System.currentTimeMillis();
		long timeTaken = endTime - startTime;
		System.out.println("Single-threaded execution finished: \n Time Taken in M = " + timeTaken);
	}
}

