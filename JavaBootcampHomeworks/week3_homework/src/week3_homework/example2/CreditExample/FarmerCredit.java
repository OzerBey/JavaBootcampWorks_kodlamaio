package week3_homework.example2.CreditExample;

public class FarmerCredit implements ICreditService {

	@Override
	public void calculate() {
		System.out.println("Farmer credit calculated..");

	}

	@Override
	public void save() {
		System.out.println("Farmer credit saved..");

	}
}
