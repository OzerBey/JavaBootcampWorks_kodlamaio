package dataAccess;

import entities.Product;

public class HibernateProductDao implements IProductDao {
	public void add(Product product) {
		System.out.println(product.getName() + " added to DB with Hibernate");
	}
}
