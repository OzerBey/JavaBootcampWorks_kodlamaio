package inheritance;

public class Employee extends Person {
	private double salary;

	public Employee() {
	}

	public Employee(double salary) {
		super();
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", getSalary()=" + getSalary() + "]";
	}

}
