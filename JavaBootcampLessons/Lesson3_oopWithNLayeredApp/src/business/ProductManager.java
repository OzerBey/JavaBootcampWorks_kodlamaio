package business;

import dataAccess.IProductDao;
import entities.Product;

public class ProductManager {
	private IProductDao productDao;

	public ProductManager(IProductDao productDao) {
		this.productDao = productDao;
	}

	public void add(Product product) throws Exception {
		// We write our business rules here...
		if (product.getUnitPrice() < 10) {
			throw new Exception("Product price must be large than 10");
		}
		productDao.add(product);
	}
}
