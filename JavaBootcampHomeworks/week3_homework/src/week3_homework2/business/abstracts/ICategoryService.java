package week3_homework2.business.abstracts;

import java.util.List;

import week3_homework2.entities.concretes.Category;

public interface ICategoryService {

	void add(Category category);

	List<Category> getAll();
}
