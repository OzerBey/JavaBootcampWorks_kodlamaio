package week3_homework2.business.concretes;

import java.util.List;

import week3_homework2.business.abstracts.ICourseService;
import week3_homework2.core.logging.ILogger;
import week3_homework2.dataAccess.abstracts.ICourseDao;
import week3_homework2.entities.concretes.Course;

public class CourseManager implements ICourseService {

	private ICourseDao courseDao;
	private List<ILogger> loggers;

	public CourseManager(ICourseDao courseDao, List<ILogger> loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	// Business rules write here
	@Override
	public void add(Course course) {
		for (Course c : courseDao.getAll()) {
			if (c.getName().equals(course.getName())) {
				System.err.println("Course name must not be the same as other course name :" + course.getName());
				System.exit(0);
			}
			if (course.getPrice() < 0) {
				System.err.println("Course price must be at least 0");
				System.exit(1);
			}
		}
		courseDao.add(course);
		for (ILogger logger : loggers) {
			logger.log("that " + course.getName() + " added ");
		}
	}

	public List<Course> getAll() {
		return courseDao.getAll();
	}

}
