package week3_homework2.dataAccess.abstracts;

import java.util.List;

import week3_homework2.entities.concretes.Category;

public interface ICategoryDao {

	void add(Category category);

	Category getCategoryById(int id);

	List<Category> getAll();
}
