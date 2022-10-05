package business;

import java.util.List;

import core.logging.ILogger;
import dataAccess.IProductDao;
import entities.Product;

public class ProductManager {
	private IProductDao productDao;
	private List<ILogger> loggers;

	public ProductManager(IProductDao productDao, List<ILogger> loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// We write our business rules here...
		if (product.getUnitPrice() < 10) {
			throw new Exception("Product price must be large than 10");
		}
		productDao.add(product);
		for (ILogger logger : loggers) {
			logger.log("that " + product.getName() + " added ");
		}
	}
}
