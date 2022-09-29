package methods;

public class Methods2 { // with parameter methods
	// variable arguments
	public static void main(String[] args) {
		// System.err.println(getDoubleRandomNumber()); //as error message
		System.out.println(sumNumbersWithoutArray(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

	public static void add() {
		// add codes here
		System.out.println("added");
	}

	public static void delete() {
		// delete codes here
		System.out.println("deleted");
	}

	public static void update() {
		// update codes here
		System.out.println("updated");
	}

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	public static int sumNumbersWithoutArray(int... numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}

	public static double getDoubleRandomNumber() {
		return Math.random();
	}
}
