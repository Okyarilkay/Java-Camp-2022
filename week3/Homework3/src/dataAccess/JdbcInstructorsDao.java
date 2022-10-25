package dataAccess;

import entities.Instructors;

public class JdbcInstructorsDao implements InstructorsDao{

	@Override
	public void add(Instructors instructors) {
		System.out.println("Instructor : added into database with JDBC");
		
	}

}
