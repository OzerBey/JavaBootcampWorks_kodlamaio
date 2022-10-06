package week3_homework2.core.logging;

public class MailLogger implements ILogger {

	@Override
	public void log(String data) {
		System.err.println("Mail sent " + data);
	}

}
