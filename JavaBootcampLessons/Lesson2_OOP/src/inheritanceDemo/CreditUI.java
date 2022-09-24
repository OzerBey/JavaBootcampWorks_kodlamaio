package inheritanceDemo;

public class CreditUI {
	public void calculateCredit(BaseCreditManager... baseCreditManager) {
		for (BaseCreditManager manager : baseCreditManager) {
			manager.calculate();
		}
	}
}
