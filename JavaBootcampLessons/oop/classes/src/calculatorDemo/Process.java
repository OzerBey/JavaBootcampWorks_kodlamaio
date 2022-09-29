package calculatorDemo;

public class Process {
	public int sum(int number1, int number2) {
		return number1 + number1;
	}

	public int sum(int... numbers) { // method overloading
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}

	public int minus(int number1, int number2) {
		return number1 - number2;
	}

	public int multiplication(int number1, int number2) {
		return number1 * number2;
	}

	public double division(double number1, double number2) {
		if (number2 == 0) {
			System.err.println("invalid operation divide by zero error (!)");
		}
		return number1 / number2;
	}
}
