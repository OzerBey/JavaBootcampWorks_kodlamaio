package week3_homework2.dataAccess.abstracts;

import java.util.List;

import week3_homework2.entities.concretes.Course;

public interface ICourseDao {

	void add(Course course);

	Course getCourseById(int id);

	List<Course> getAll();
}
