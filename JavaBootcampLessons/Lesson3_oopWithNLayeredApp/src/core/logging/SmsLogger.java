package core.logging;

public class SmsLogger implements ILogger {

	@Override
	public void log(String data) {
		System.err.println("SMS sent " + data);

	}

}
