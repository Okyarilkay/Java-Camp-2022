package business;

import core.logging.Logger;
import dataAccess.InstructorsDao;
import entities.Instructors;



public class InstructorManager {
	
	private Logger[] loggers;
	InstructorsDao instructorsDao;
	Instructors[] instructors;
	
	
	public InstructorManager(InstructorsDao instructorsDao,Logger[] loggers) {
		this.instructorsDao = instructorsDao;
		this.loggers = loggers;
	}
	public void add(Instructors instructors) throws Exception {
		Instructors[] instructors2 = {new Instructors(1,"Engin","Demirog")};
		for(Instructors instructor:instructors2) {
			if (instructors.getName()==instructor.getName() && instructors.getLastName()==instructor.getLastName()) {
				throw new Exception("This instructor already in the list.");
			}
		}
		
		instructorsDao.add(instructors);
        for (Logger logger : loggers) {
            logger.log(instructors.getName() + " " + instructors.getLastName());
        }
        System.out.println("---------------------");
	}	
	
}
