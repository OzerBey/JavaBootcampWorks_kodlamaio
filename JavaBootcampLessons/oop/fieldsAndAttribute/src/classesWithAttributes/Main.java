package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Mouse");
		product.setStockAmount(3);
		product.setPrice(250);

		ProductManager productManager = new ProductManager();
		productManager.add(product);
		System.out.println(product.getPrice());
	}

}
