package multithreading_work;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTask implements Runnable {
	private final String filePath;
	private final long start;
	private final long end;

	public FileReadTask(String filePath, long start, long end) {
		this.filePath = filePath;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		try {
			readFileChunk();
		} catch (FileReadCustomException e) {
			System.err.println("Error in thread: " + e.getMessage());
		}
	}

	private void readFileChunk() throws FileReadCustomException {
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			reader.skip(start);
			char[] buffer = new char[(int) (end - start)];
			reader.read(buffer, 0, buffer.length);
			String chunk = new String(buffer);
			System.out.println(Thread.currentThread().getName() + " read chunk: " + chunk);
		} catch (IOException e) {
			throw new FileReadCustomException("Failed to read file chunk from " + start + " to " + end, e);
		}
	}
}

