package oopIntro;

public class Main {
	// Everything is class in java.
	public static void main(String[] args) {
		Product product1 = new Product(); // instance creation
		Product product2 = new Product(); // instance creation
		Product product3 = new Product(); // instance creation

		// product1
		product1.setId(1);
		product1.setName("AsusFx504");
		product1.setUnitPrice(6500);
		product1.setDetail("8 GB RAM & 1TB HDD");
		product1.setDiscount(10);

		System.out.println(product1.getUnitPriceAfterDiscount());

		// for categoty1
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Teknology");

		// for category2
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Home tools");

		System.out.println(category1.getName());
		System.out.println(category2.getName());
		// productManagement(product1, product2, product3);

	}

	private static void productManagement(Product product1, Product product2, Product product3) {
		Product products[] = { product1, product2, product3 };

		System.out.println("number of products :" + products.length);

		for (Product product : products) {
			System.out.println(product.getId() + " " + product.getName());
		}
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Computer");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Garden");

		Category category3 = new Category();
		category3.setId(3);
		category3.setName("Livingroom");

		ProductManager productManager = new ProductManager();
		// 1st product
		productManager.addToCart(product1);
		// 2nd product
		productManager.addToCart(product2);
		// 3rd product
		productManager.addToCart(product3);
	}
}
