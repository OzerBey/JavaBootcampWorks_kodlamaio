package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	
	@Override
	public void log(String message) {
		System.out.println("logged to database " + message);
	}
}
