package interfaces;

public class SqlServerCustomerDal implements ICustomerDal {

	@Override
	public void Add() {
		System.out.println("Sql Server eklendi.");
		
	}

	@Override
	public void Update() {
		System.out.println("Sql Server güncellendi.");
		
	}

}
