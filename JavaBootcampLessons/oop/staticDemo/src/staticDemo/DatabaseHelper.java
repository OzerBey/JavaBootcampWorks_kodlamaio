package staticDemo;

public class DatabaseHelper {

	public static class Crud {
		public static void add() {
			System.out.println("added by static crud class");
		}

		public static void delete() {

			System.err.println("deleted by static crud class");
		}

	}

	public static class Connection {
		public static void createConnection() {
			System.out.println("connection created");
		}
	}
}
