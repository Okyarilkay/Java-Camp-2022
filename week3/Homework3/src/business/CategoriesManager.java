package business;

import core.logging.Logger;
import dataAccess.CategoriesDao;
import entities.Categories;
import entities.Courses;

public class CategoriesManager {
	Categories[] categories;
	CategoriesDao categoriesDao;
	private Logger[] loggers;
	public CategoriesManager(CategoriesDao categoriesDao,Logger[] loggers) {
		this.categoriesDao = categoriesDao;
		this.loggers = loggers;
	}
	public void add(Categories categories) throws Exception{
		Categories[] categories2 = {new Categories(1, "Programming")};
		for(Categories category:categories2) {
			if(categories.getName()==category.getName()) {
				throw new Exception("Category name cannot repeat.");
			}
			else if (categories.getId()==category.getId()) {
				throw new Exception("ID should be unique.");
			}
		}
		categoriesDao.add(categories);
		for (Logger logger : loggers) {
			logger.log(categories.getName());
		}
		System.out.println("---------------------");
	}
	
	
	
}
