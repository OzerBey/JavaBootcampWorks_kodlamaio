package calculatorDemo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Process process = new Process();
		System.out.println(process.minus(3, 4));
		System.out.println(process.division(12, 24));

		Scanner scan = new Scanner(System.in);
		System.err.println("Enter 2 number for ur process");
		System.out.println("enter first number :");
		double number1 = scan.nextDouble();
		System.out.println("enter second number :");
		double number2 = scan.nextDouble();
		System.out.println(process.division(number1, number2));
	}

}
