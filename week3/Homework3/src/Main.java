import business.CategoriesManager;
import business.CoursesManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateCategoriesDao;
import dataAccess.HibernateCoursesDao;
import dataAccess.HibernateInstructorsDao;
import dataAccess.JdbcCategoriesDao;
import dataAccess.JdbcCoursesDao;
import dataAccess.JdbcInstructorsDao;
import entities.Categories;
import entities.Courses;
import entities.Instructors;


public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new EmailLogger()};
		
		CoursesManager coursesManager = new CoursesManager(new HibernateCoursesDao(),loggers);
		CoursesManager coursesManager2 = new CoursesManager(new JdbcCoursesDao(), loggers);
		Courses courses1 = new Courses(1,"Python",2);
		Courses courses2 = new Courses(2,"C#",22);
		//Courses courses3 = new Courses(3,"Java",42);
		
		coursesManager.add(courses1);
		coursesManager2.add(courses2);
		//coursesManager.add(courses3);
		
		CategoriesManager categoriesManager = new CategoriesManager(new JdbcCategoriesDao(), loggers);
		CategoriesManager categoriesManager2 = new CategoriesManager(new HibernateCategoriesDao(), loggers);
		
		Categories categories = new Categories(2, "Web");
		Categories categories2 = new Categories(3, "Mobile");
		Categories categories3 = new Categories(4, "Cyber Security");
		//Categories categories4 = new Categories(5, "Programming");
		
		categoriesManager.add(categories);
		categoriesManager.add(categories2);
		categoriesManager2.add(categories3);
		//categoriesManager2.add(categories4);
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorsDao(), loggers);
		InstructorManager instructorManager2 = new InstructorManager(new JdbcInstructorsDao(), loggers);
		
		Instructors instructors = new Instructors(2, "Osman Okyar", "Ilkay");
		Instructors instructors2 = new Instructors(3,"Mustafa Murat","Coskun");
		//Instructors instructors3 = new Instructors(4, "Engin", "Demirog");
		
		instructorManager.add(instructors);
		instructorManager2.add(instructors2);
		//instructorManager2.add(instructors3);
	}

}
