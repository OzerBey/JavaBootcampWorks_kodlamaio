package week3_homework2.core.logging;

public class DatabaseLogger implements ILogger {

	@Override
	public void log(String data) {
		System.err.println("Logged to DB " + data);
	}

}
