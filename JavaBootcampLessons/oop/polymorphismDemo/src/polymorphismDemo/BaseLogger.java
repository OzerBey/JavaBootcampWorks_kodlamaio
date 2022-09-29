package polymorphismDemo;

public class BaseLogger { // Base class
//this works if not override
	public void log(String message) {
		System.out.println("Default logger: " + message);
	}

}
