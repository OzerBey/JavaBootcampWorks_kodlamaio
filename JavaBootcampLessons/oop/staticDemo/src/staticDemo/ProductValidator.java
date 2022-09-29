package staticDemo;

public class ProductValidator {

	static {
		System.err.println("static constructor");
	}

	public ProductValidator() {
		System.out.println("contructor");
	}

	public static boolean IsValid(Product product) {
		if (product.price > 0 && !(product.name.isEmpty())) {
			return true;
		} else
			return false;
	}
}
