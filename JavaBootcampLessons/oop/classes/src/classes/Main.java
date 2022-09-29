package classes;

// properties of classes are grouping and feature holder
public class Main {

	static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		Customer customer1 = new Customer(1, "Yasin", "Ozer", 1500);
		Customer customer2 = new Customer();
		customer2.id = 2;
		customer2.firstName = "Ozer";
		customer2.lastName = "Yasin";
		customer2.balance = 100;
		// manager
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer1);
		customerManager.add(customer2);

		System.err.println(fibonacci(6));
	}
}