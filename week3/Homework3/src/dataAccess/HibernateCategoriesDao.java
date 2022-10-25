package dataAccess;

import entities.Categories;

public class HibernateCategoriesDao implements CategoriesDao {

	@Override
	public void add(Categories categories) {
		System.out.println("Category : added into database with hibernate.");
		
	}

}
