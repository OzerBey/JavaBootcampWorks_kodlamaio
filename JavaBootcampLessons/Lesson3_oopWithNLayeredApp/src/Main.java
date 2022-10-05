import java.util.ArrayList;
import java.util.List;

import business.ProductManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import dataAccess.JdbcProductDao;
import entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product phone = new Product(1, "Phone XR", 10000); // This is data come from user.
		Product computer = new Product(1, "Computer AX", 5000);
		Product table = new Product(1, "Table XII", 3000);

		List<ILogger> loggers = new ArrayList<ILogger>();
		loggers.add(new MailLogger());
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);

		// Here business management
		productManager.add(phone);
		productManager.add(computer);
		productManager.add(table);
	}
}
