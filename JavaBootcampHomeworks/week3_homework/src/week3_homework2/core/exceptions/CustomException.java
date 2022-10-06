package week3_homework2.core.exceptions;

public class CustomException extends RuntimeException {

	private String message;

	public CustomException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
