package week3_homework.example2;

import week3_homework.example2.CreditExample.ICreditService;
import week3_homework.example2.CreditExample.MilitaryCredit;

public class Main {

	// MAIN //
	public static void main(String[] args) {
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.save();

		// Customer process
		Customer customerOzer = new Customer(1, "Yasin", "Özer", "0123456789");
		CustomerManager customerManager = new CustomerManager(customerOzer, new MilitaryCredit());
		customerManager.save();
		customerManager.delete();

	}

	static class CreditManager { // This class static must be because main method is static
		public void calculate() {
			System.out.println("Credit calculated..");
		}

		public void save() {
			System.out.println("Credit completed..");
		}
	}

	static class Customer {

		// Attributes | Fields of Customer
		private int id;
		private String firstName;
		private String lastName;
		private String nationalIdendity;

		public Customer(int id, String firstName, String lastName, String nationalIdendity) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.nationalIdendity = nationalIdendity;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getNationalIdendity() {
			return nationalIdendity;
		}

		public void setNationalIdendity(String nationalIdendity) {
			this.nationalIdendity = nationalIdendity;
		}

	}

	static class CustomerManager {
		private Customer customer;
		private ICreditService creditService;

		public CustomerManager(Customer customer, ICreditService creditService) {
			this.customer = customer;
			this.creditService = creditService;
		}

		public void save() {
			System.out.println(customer.getFirstName() + " saved..");
		}

		public void delete() {
			System.err.println(customer.getFirstName() + " deleted..");
		}
	}

	class Person { // BASE class !!But not used
		// This base class use for inheritance and easy management
		private int id;
		private String name;
	}
}
