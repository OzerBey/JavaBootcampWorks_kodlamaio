package classes;

public class CustomerManager {

	Customer[] customers;

	// this class represent simulation of CRUD operations
	public void add(Customer customer) {
		// customer added to database
		System.out.println(customer.firstName + " added");
	}

	public void delete(Customer customer) {
		// customer deleted from database
		System.out.println(customer.firstName + " deleted");
	}

	public void update(Customer customer) {
		// customer updated in database
		System.out.println(customer.firstName + " updated");
	}

	public Customer[] showCustomerList() {
		// show the customer list
		// ..
		return customers;
	}
}