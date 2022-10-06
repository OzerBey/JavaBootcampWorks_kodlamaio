package week3_homework.example2.CreditExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreditUI {

	public static void main(String[] args) {
		List<ICreditService> creditServices = new ArrayList<ICreditService>();
		MilitaryCredit militaryCredit = new MilitaryCredit();
		TeacherCredit teacherCredit = new TeacherCredit();
		FarmerCredit farmerCredit = new FarmerCredit();
		creditServices.add(militaryCredit);
		creditServices.add(teacherCredit);
		creditServices.add(farmerCredit);

		// Input from user
		Scanner scan = new Scanner(System.in);
		boolean isExit = false;
		while (!isExit) {
			System.out.println(
					"------UI-----\nEnter a number for\n Military credit (1)\n Teacher credit (2)\n Farmer credit (3)\n all credits (4)\n Exit for press (5)");
			int input = scan.nextInt();
			switch (input) {
			case 1:
				militaryCredit.calculate();
				break;

			case 2:
				teacherCredit.calculate();
				break;

			case 3:
				farmerCredit.calculate();
				break;

			case 4:
				for (ICreditService credit : creditServices) {
					credit.calculate();
				}
				break;
			case 5:
				isExit = true;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + input + " please enter valid value");
			}
		}

	}
}
