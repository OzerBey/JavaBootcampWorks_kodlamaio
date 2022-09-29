package inheritance2;

public class Main {

	public static void main(String[] args) {
		// objects
		Customer customer = new Customer();
		Employee employee = new Employee();

		// managers
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();

		customerManager.add();
		employeeManager.BestEmployee();
	}

}
