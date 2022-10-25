package business;


import core.logging.Logger;
import dataAccess.CoursesDao;
import entities.Courses;
import dataAccess.JdbcCoursesDao;
import dataAccess.HibernateCoursesDao;
import core.logging.DatabaseLogger;
import java.util.List;



public class CoursesManager {
	private CoursesDao coursesDao;
	private Logger[] loggers;
	private Courses[] coursess;
	
	
	public CoursesManager(CoursesDao coursesDao,Logger[] loggers) {
		this.coursesDao = coursesDao;
		this.loggers = loggers;
	}
	public void add(Courses courses) throws Exception {
			// iş kuralları
			Courses[] coursess = {new Courses(1, "Java", 10), new Courses(2, "Javascript", 25)};
			for (Courses c : coursess) {
				if (courses.getName() == c.getName()) {
					throw new Exception("The course name cannot repeat.");
				} else if (courses.getPrice() < 0) {
					throw new Exception("The course's price can't be lower than 0.");
				}
			
			coursesDao.add(courses);
			for (Logger logger : loggers) {
				logger.log(courses.getName());
			}
			System.out.println("---------------------");
	}
	
	
}
}
