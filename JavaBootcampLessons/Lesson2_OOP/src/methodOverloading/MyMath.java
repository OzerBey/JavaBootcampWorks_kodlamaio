package methodOverloading;

public interface MyMath {

	int sum(int num1, int num2);

	int sum(int num1, int num2, int num3);

	double sum(int... nums);

	double sub(int... nums);

	int multiply(int num1, int num2);

	double multiply(int... nums);

}
