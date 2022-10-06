package week3_homework.example3;

public class CustomerManager {

	private ICustomerDao customerDao;

	public CustomerManager(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	// Business rules here
	public void add() {
		customerDao.add();
	}

}
