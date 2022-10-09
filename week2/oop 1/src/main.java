
public class main {

	public static void main(String[] args) {
		String message = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi");
		product1.setDiscount(7);
		product1.setUnitInStock(2);
		product1.setImageUrl("unknown1.jpg");
		product1.setUnitPrice(750);
		// set value
		/*
		 * product1.name = "Delonghi Coffee Machine"; product1.unitPrice = 7500;
		 * product1.discount = 7; product1.unitInStock = 3; product1.imageUrl =
		 * "unknown.jpg";
		 */
		// get
		// System.out.println(product1.name);
		Product product2 = new Product();
		product2.setName("smeg");
		product2.setDiscount(3);
		product2.setUnitInStock(4);
		product2.setImageUrl("unknown2.jpg");
		product2.setUnitPrice(332);
		// set value
		/*
		 * product2.name = "Smeg Coffee Machine"; product2.unitPrice = 6500;
		 * product2.discount = 8; product2.unitInStock = 1; product2.imageUrl =
		 * "unknown1.jpg";
		 */

		Product product3 = new Product();
		product3.setName("kitchen aid");
		product3.setDiscount(6);
		product3.setUnitInStock(1);
		product3.setImageUrl("unknown3.jpg");
		product3.setUnitPrice(7502);
		// set value
		/*
		 * product3.name = "Kitchen aid Coffee Machine"; product3.unitPrice = 4500;
		 * product3.discount = 9; product3.unitInStock = 5; product3.imageUrl =
		 * "unknown2.jpg";
		 */

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());

		}
		individualCustomer IndividualCustomer = new individualCustomer();
		IndividualCustomer.setId(1);
		IndividualCustomer.setCustomerNumber("123123");
		IndividualCustomer.setPhoneNumber("0541234");
		IndividualCustomer.setFirstName("osman");
		IndividualCustomer.setLastName("okyar");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Ilkay ltd");
		corporateCustomer.setTaxNumber("123321");
		corporateCustomer.setPhoneNumber("084321");
		corporateCustomer.setCustomerNumber("766534");
		
		Customer[] customers = {IndividualCustomer,corporateCustomer};
		for(Customer customer:customers) {
			System.out.println(customer.getCustomerNumber());
		}
		
	}

}
