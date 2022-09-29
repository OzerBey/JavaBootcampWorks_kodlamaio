package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		TeacherCreditManager teacherCreditManager = new TeacherCreditManager();

		CreditUI creditUI = new CreditUI();
		// for teacher credit
		creditUI.calculateCredit(teacherCreditManager);
		// for retired credit
		creditUI.calculateCredit(new RetiredCreditManager());

	}

}
