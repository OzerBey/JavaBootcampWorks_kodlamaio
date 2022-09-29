package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.name = "monitor";
		product.price = 1000;

		productManager.add(product);

		DatabaseHelper.Crud.add();
	}

}