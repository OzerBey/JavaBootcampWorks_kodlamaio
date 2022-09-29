package abstractDemo;

public class CustomerManager {

	BaseDatabaseManager database;

	public void getCustomers() {
		database.getData();
	}
}
