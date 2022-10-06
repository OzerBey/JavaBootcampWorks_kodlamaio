package week3_homework.example1;

public class PrimitiveType implements IShowType {

	public void show() {
		int num1 = 10; // declare num1 = 10
		int num2 = 20; // declare num2 = 20
		num1 = num2; // num2->num1 assignment
		num2 = 100; // declare num2 = 100
		System.err.println("num1: " + num1); // Now, num1 is value of num2 in stack.
	}
}
