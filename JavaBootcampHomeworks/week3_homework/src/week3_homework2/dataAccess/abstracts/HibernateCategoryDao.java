package week3_homework2.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import week3_homework2.core.exceptions.CategoryNotFoundException;
import week3_homework2.entities.concretes.Category;

public class HibernateCategoryDao implements ICategoryDao {
	private List<Category> categories = new ArrayList<Category>();

	public HibernateCategoryDao() {
		categories.add(new Category(1, "IT"));
		categories.add(new Category(2, "Devops"));
		categories.add(new Category(3, "FrontEnd Development"));
		categories.add(new Category(4, "BackEnd Development"));
	}

	public void add(Category category) {
		categories.add(category);
	}

	public Category getCategoryById(int id) {
		Category temp = null;
		for (Category category : getAll()) {
			if (category.getId() == id)
				temp = category;
			throw new CategoryNotFoundException(); // This expression throw an custom exception
		}
		return temp;
	}

	public List<Category> getAll() {
		return categories;
	}

}
