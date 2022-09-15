
public class ConditionStructure {

	public ConditionStructure() {

	}

	public static void conditionForExercises() {

		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";

		System.out.println("ortaMetin");
		System.out.println(ortaMetin);

		int vade = 12;

		double dolarDun = 18.10;
		double dolarBugun = 18.10;

		boolean dolarDustuMu = false;

		String okYonu = "";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if (dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		} else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}

		// array structure
		String[] credits = { "Hızlı Kredi", "Maaşını Halkbanktan", "Mutlu Emekli" };

		// access directly
		System.out.println(credits[0]);
		System.out.println(credits[1]);
		System.out.println(credits[2]);

		// access using for loop
		for (int i = 0; i < 3; i++) {
			System.out.println(credits[i]);
		}

		// access using forEach loop
		for (String item : credits) {
			System.out.println(item);
		}
	}
}
