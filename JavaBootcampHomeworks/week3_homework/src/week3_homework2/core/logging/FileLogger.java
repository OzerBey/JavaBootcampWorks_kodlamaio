package week3_homework2.core.logging;

public class FileLogger implements ILogger {

	@Override
	public void log(String data) {
		System.err.println("Logged to file " + data);
	}

}
