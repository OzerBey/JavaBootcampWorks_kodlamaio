package polymorphismDemo;

public class FileLogger extends BaseLogger {

	@Override
	public void log(String message) {
		System.out.println("logged to file " + message);
	}
}
