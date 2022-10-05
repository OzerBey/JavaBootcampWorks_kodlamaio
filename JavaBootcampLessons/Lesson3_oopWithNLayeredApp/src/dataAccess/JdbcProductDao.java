package dataAccess;

import entities.Product;

public class JdbcProductDao implements IProductDao {
	// You only must write here database access processes...// Required SQL
	public void add(Product product) {
		System.out.println(product.getName() + " added to DB with JDBC");
	}
}
