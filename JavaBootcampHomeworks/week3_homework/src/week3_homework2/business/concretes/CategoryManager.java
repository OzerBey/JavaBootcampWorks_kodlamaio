package week3_homework2.business.concretes;

import java.util.List;

import week3_homework2.business.abstracts.ICategoryService;
import week3_homework2.dataAccess.abstracts.ICategoryDao;
import week3_homework2.entities.concretes.Category;

public class CategoryManager implements ICategoryService {

	private ICategoryDao categoryDao;

	public CategoryManager(ICategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	// Business rules write here
	@Override
	public void add(Category category) {
		for (Category c : categoryDao.getAll()) {
			if (c.getName().equals(category.getName())) {
				System.err.println("Course name must not be the same as other category name :" + category.getName());
				System.exit(1);
			}
		}
		categoryDao.add(category);
	}

	public List<Category> getAll() {
		return categoryDao.getAll();
	}

}
