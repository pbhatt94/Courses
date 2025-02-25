package multithreading_work;

import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
	private static final int NUM_THREADS = 4;

	public static void main(String[] args) {
		String filePath = "./fileToRead.txt";

		File file = new File(filePath);
		if (!file.exists()) {
			System.err.println("File does not exist: " + filePath);
			return;
		}

		ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

		long fileSize = file.length();
		long chunkSize = fileSize / NUM_THREADS;
		Future<?>[] futures = new Future[NUM_THREADS];

		try {
			for (int i = 0; i < NUM_THREADS; i++) {
				long start = i * chunkSize;
				long end = (i == NUM_THREADS - 1) ? fileSize : (i + 1) * chunkSize;
				futures[i] = executor.submit(new FileReadTask(filePath, start, end));
			}

			for (Future<?> future : futures) {
				try {
					future.get();
				} catch (InterruptedException | ExecutionException e) {
					System.err.println("Thread execution failed: " + e.getMessage());
				}
			}
		} finally {
			executor.shutdown();
		}
	}
}
