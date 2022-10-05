import business.ProductManager;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product phone = new Product(1, "Phone XR", 10000); // This is data come from user.
		Product computer = new Product(1, "Computer AX", 5000);
		Product table = new Product(1, "Table XII", 3000);

		ProductManager productManager = new ProductManager(new JdbcProductDao());

		// Here business management
		productManager.add(phone);
		productManager.add(computer);
		productManager.add(table);
	}
}
