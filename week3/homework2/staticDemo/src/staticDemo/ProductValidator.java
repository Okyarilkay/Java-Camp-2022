package staticDemo;

public class ProductValidator {
	static {
		System.out.println("static yapici blok calisti");
	}
	public ProductValidator() {
		System.out.println("yapıcı blok çalıştı");
	}
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
