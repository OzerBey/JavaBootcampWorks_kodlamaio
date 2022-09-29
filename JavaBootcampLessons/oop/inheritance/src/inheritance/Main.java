package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer yasin = new IndividualCustomer();
		yasin.customerNumber = "12345";

		CorporateCustomer zrBey = new CorporateCustomer();
		zrBey.customerNumber = "54321";

		Customer ali = new RetiredCustomer();
		ali.customerNumber = "13579";

		CustomerManager customerManager = new CustomerManager();
		/*
		 * customerManager.add(yasin); customerManager.add(zrBey);
		 * customerManager.add(ali);
		 * 
		 */
		Customer[] customers = { yasin, zrBey, ali };
		customerManager.addMuliple(customers);
	}

}
