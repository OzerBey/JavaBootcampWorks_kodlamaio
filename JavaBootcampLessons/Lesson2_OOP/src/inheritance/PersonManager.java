package inheritance;

public class PersonManager {

	// Base CRUD operations

	public void add(Person person) {

		System.out.println(person.getFirstName() + " added successfully.");

	}

	public void list() {

		System.out.println("listing operation completed.");

	}

	public void update() {

		System.out.println("updating operation completed.");

	}

	public void delete() {

		System.out.println("deleting operation completed.");

	}

}
