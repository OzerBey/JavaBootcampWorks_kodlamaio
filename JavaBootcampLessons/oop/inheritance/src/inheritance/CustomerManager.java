package inheritance;

public class CustomerManager {
	// we used the methods for reusability
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " saved to database");
	}

	// bulk insert ~ multiple insert
	public void addMuliple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
