package interfaces;
// Dal = Data Acces Layer
public class MySqlCustomerDal implements ICustomerDal , IRepository{

	@Override
	public void Add() {
		System.out.println("My Sql eklendi.");
		
	}

	@Override
	public void Update() {
		// TODO Auto-generated method stub
		
	}
	
}
