package dataAccess;

import entities.Courses;

public class HibernateCoursesDao implements CoursesDao {

	@Override
	public void add(Courses courses) {
		System.out.println("Course : added into database with hibernate.");
		
	}

}
