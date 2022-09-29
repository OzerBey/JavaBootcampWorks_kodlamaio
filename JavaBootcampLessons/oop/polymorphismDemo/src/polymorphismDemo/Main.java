package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		// loggerArrayFunction();
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

	private static void loggerArrayFunction() {
		/*
		 * EmailLogger logger1 = new EmailLogger(); logger1.log("log message");
		 * BaseLogger logger = new FileLogger(); logger.log(" by ozer");
		 */
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DatabaseLogger(), new EmailLogger(),
				new ConsoleLogger() };

		// multiple log
		for (BaseLogger baseLogger : loggers) {
			baseLogger.log("by loop");
		}
	}
}