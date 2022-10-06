package week3_homework2.business.abstracts;

import java.util.List;

import week3_homework2.entities.concretes.Course;

public interface ICourseService {

	void add(Course course);

	List<Course> getAll();
}
