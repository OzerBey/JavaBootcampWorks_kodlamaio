package methodOverloading;

public class Main {
	public static void main(String[] args) {
		MyMathManager manager = new MyMathManager();
		System.err.println(manager.sum(1, 2)); // sum operation with two parameter
		System.err.println(manager.sum(1, 2, 3)); // sum operation with three parameter
		System.err.println(manager.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // multiple parameter [(n*n+1)/2]
		System.err.println(manager.sub(10, 2, 5));
		System.err.println(manager.multiply(1, 2));
		System.err.println(manager.multiply(1, 2, 3, 4, 5)); // 5!=120
	}
}
