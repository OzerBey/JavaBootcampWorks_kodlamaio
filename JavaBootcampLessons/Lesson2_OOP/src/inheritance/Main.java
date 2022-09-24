package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer(1, "12345", "0123456789");
		customer.setFirstName("FirstCustomerName");
		customer.setAge(24);
		Employee employee = new Employee(15000);
		employee.setFirstName("FirstEmployeeName");

		CustomerManager customerManager = new CustomerManager();
		customerManager.add(customer);
		customerManager.list();

		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.add(employee);
		employeeManager.list();

	}

}
