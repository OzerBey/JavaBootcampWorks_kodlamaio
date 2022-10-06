package week3_homework2.UI;

import week3_homework2.business.concretes.CategoryManager;
import week3_homework2.business.concretes.CourseManager;
import week3_homework2.dataAccess.abstracts.HibernateCategoryDao;
import week3_homework2.dataAccess.abstracts.JdbcCourseDao;
import week3_homework2.entities.concretes.Category;
import week3_homework2.entities.concretes.Course;

public class UI {

	public static void main(String[] args) {

		// Course
		CourseManager courseManager = new CourseManager(new JdbcCourseDao());
		Course java = new Course(6, "Algorithm", 2000);
		courseManager.add(java);

		courseManager.add(new Course(7, "Java", 10000));

		// All course get simulation
		for (Course course : courseManager.getAll()) {
			System.out.println(course.toString());
		}

		// Category
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
		Category category = new Category(5, "Business development");
		categoryManager.add(category);

		// All categories
		System.out.println(categoryManager.getAll());
	}

}
