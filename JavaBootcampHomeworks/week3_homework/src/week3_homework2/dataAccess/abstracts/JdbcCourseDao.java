package week3_homework2.dataAccess.abstracts;

import java.util.ArrayList;
import java.util.List;

import week3_homework2.core.exceptions.CourseNotFoundException;
import week3_homework2.entities.concretes.Course;

public class JdbcCourseDao implements ICourseDao {

	// Like DB
	private List<Course> courses = new ArrayList<Course>();

	public JdbcCourseDao() {
		courses.add(new Course(1, "Java", 1000));
		courses.add(new Course(2, "Spring Boot", 1000));
		courses.add(new Course(3, "ReactJS", 950));
		courses.add(new Course(4, "C#", 1000));
		courses.add(new Course(5, "Javascript", 1000));
	}

	public void add(Course course) {
		courses.add(course);
		// courses.add(new Course(1, "Math", 100));
	}

	public Course getCourseById(int id) {
		Course temp = null;
		for (Course course : getAll()) {
			if (course.getId() == id)
				temp = course;
			throw new CourseNotFoundException(); // This expression throw an custom exception
		}
		return temp;
	}

	public List<Course> getAll() {
		return courses;
	}
}
