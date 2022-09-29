package staticDemo;

public class ProductManager {

	public void add(Product product) {
		if (ProductValidator.IsValid(product)) {
			System.out.println("added to database");
		} else
			System.out.println("invalid product ");
	}
}
