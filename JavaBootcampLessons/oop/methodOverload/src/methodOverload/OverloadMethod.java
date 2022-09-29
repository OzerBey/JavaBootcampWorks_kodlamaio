package methodOverload;

public class OverloadMethod {

	public int add(int num1, int num2) { // 2 parameters
		return num1 + num2;
	}

	public int add(int num1, int num2, int num3) { // 3 parameters
		return num1 + num2 + num3;
	}

	public int add(int... nums) { // multi parameters
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		return sum;
	}
}
