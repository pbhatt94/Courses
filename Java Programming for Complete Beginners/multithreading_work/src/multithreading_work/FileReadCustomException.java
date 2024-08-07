package multithreading_work;

//Custom checked exception for file read errors
public class FileReadCustomException extends Exception {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	// Constructor with a custom message
	public FileReadCustomException(String message) {
		super(message);
	}

	// Constructor with a custom message and cause
	public FileReadCustomException(String message, Throwable cause) {
		super(message, cause);
	}
}

