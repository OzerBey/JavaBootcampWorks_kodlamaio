package week3_homework2.UI;

import java.util.ArrayList;
import java.util.List;

import week3_homework2.business.concretes.CategoryManager;
import week3_homework2.business.concretes.CourseManager;
import week3_homework2.core.logging.DatabaseLogger;
import week3_homework2.core.logging.FileLogger;
import week3_homework2.core.logging.ILogger;
import week3_homework2.core.logging.MailLogger;
import week3_homework2.core.logging.SmsLogger;
import week3_homework2.dataAccess.abstracts.HibernateCategoryDao;
import week3_homework2.dataAccess.abstracts.JdbcCourseDao;
import week3_homework2.entities.concretes.Category;
import week3_homework2.entities.concretes.Course;

public class UI {

	public static void main(String[] args) {
		List<ILogger> loggers = new ArrayList<ILogger>();
		loggers.add(new MailLogger());
		loggers.add(new FileLogger());
		loggers.add(new DatabaseLogger());
		loggers.add(new SmsLogger());

		// -- Course -- //
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		Course java = new Course(6, "Algorithm", 2000);
		courseManager.add(java);

		courseManager.add(new Course(7, "Java", 10000));

		// All course get simulation
		for (Course course : courseManager.getAll()) {
			System.out.println(course.toString());
		}

		// -- Category -- //
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
		Category category = new Category(5, "Business development");
		categoryManager.add(category);

		// All categories
		System.out.println(categoryManager.getAll());
	}

}
