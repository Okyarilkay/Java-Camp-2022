package interfaces;



public class CustomerManager {
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//iş kodları
		customerDal.Add();
		
	}
	public void update() {
		//iş kodları
		customerDal.Update();
		
	}
}
