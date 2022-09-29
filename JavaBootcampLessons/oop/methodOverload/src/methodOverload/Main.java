package methodOverload;

public class Main {

	public static void main(String[] args) {
		OverloadMethod overloadMethod = new OverloadMethod();
		System.out.println(overloadMethod.add(1, 2));
		System.out.println(overloadMethod.add(1, 2, 3));
		System.out.println(overloadMethod.add(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

}
