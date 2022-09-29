package methods;

import java.util.Scanner;

public class Methods1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a integer");
		int number = scan.nextInt();

		IsOdd(number);
	}

	public static void IsOdd(int number) {
		sendMessage(number % 2 == 0);

	}

	public static void sendMessage(boolean value) {
		if (value) {
			System.out.println("Not odd");
		} else {
			System.out.println("Odd");
		}
	}
}
