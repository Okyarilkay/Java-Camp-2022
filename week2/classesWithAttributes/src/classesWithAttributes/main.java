package classesWithAttributes;

public class main {

	public static void main(String[] args) {
		Product product = new Product(1,"laptop","monster laptop",3000,2,"siyah");
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Monster Laptop");
//		product.setPrice(5000);
//		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());
	}

}
