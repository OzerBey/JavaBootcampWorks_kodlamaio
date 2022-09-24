package oop1;

public class Main {

	public static void main(String[] args) {
		var message = "Initialize the product";

		Product product1 = new Product();

		// set values
		product1.setName("Morely Masa");
		product1.setUnitPrice(3500);
		product1.setDiscount(7);
		product1.setUnitsInStock(5);
		product1.setImageUrls("product_photo_masa.jpg");

		System.out.println(message);

		// get values
		System.out.println(product1.getName());
		System.out.println(product1.getUnitPrice());
		System.out.println(product1.getUnitsInStock());
		System.out.println(product1.getImageUrls());

		// other products for array structure
		Product product2 = new Product();

		product2.setName("Morely Bilgisayar");
		product2.setUnitPrice(3500);
		product2.setDiscount(7);
		product2.setUnitsInStock(5);
		product2.setImageUrls("product_photo_ilgisayar.jpg");

		Product product3 = new Product();

		product3.setName("Morely Kitaplik");
		product3.setUnitPrice(3500);
		product3.setDiscount(7);
		product3.setUnitsInStock(5);
		product3.setImageUrls("product_photo_kitaplik.jpg");

		Product product4 = new Product();

		product4.setName("Morely Ekran");
		product4.setUnitPrice(3500);
		product4.setDiscount(7);
		product4.setUnitsInStock(5);
		product4.setImageUrls("product_photo_ekran.jpg");

		Product[] products = { product1, product2, product3, product4 };

		// list all of products
		showAllProducts(products);

		// individual customer instance
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0212002432");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Yasin");
		individualCustomer.setLastName("Özer");

		// corporate customer instance
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Özer");
		corporateCustomer.setCustomerNumber("12224");
		corporateCustomer.setPhone("0212323994");
		corporateCustomer.setTaxNumber("1234567891");

		// all of customers | like DB schema
		Customer[] customers = { individualCustomer, corporateCustomer };

		// list all of customers
		showAllCustomers(customers);

		// dynamic show the list structure
		System.err.println("Dynamic array listing");
		ListArray<Customer> array = new ListArray<Customer>();
		array.listArray(customers);
	}

	private static void showAllProducts(Product[] products) {
		for (Product product : products) {
			System.out.println(product.toString());
		}
		System.err.println("-----***------");
	}

	private static void showAllCustomers(Customer[] customers) {
		for (Customer customer : customers) {
			System.out.println(customer.toString());
		}
	}

}
