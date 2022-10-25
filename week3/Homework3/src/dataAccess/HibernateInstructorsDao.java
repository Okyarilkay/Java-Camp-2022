package dataAccess;

import entities.Instructors;

public class HibernateInstructorsDao implements InstructorsDao{

	@Override
	public void add(Instructors instructors) {
		System.out.println("Instructor : added into database with hibernate.");
		
	}

}
