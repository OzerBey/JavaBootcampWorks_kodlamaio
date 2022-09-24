package methodOverloading;

public class MyMathManager implements MyMath {

	@Override
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	// this method is same as above method but different their parameters
	@Override
	public int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}

	@Override
	public double sum(int... nums) {
		double result = 0;
		// with for each loop
		for (int num : nums) {
			result += num;
		}
		return result;
	}

	@Override
	public double sub(int... nums) {
		double result = 0;
		// with for loop
		for (int i = 0; i < nums.length; i++) {
			result -= nums[i];
		}
		return result;
	}

	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public double multiply(int... nums) {
		double result = 1;

		for (int num : nums) {
			result *= num;
		}
		return result;
	}

}
