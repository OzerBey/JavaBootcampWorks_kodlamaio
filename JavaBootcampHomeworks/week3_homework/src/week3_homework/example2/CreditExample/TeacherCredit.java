package week3_homework.example2.CreditExample;

public class TeacherCredit extends BaseCreditManager {

	@Override
	public void calculate() {
		System.out.println("Teacher credit calculated..");

	}

	@Override
	public void save() {
		System.out.println("This area can use extra process for teacher credits");
		super.save();
	}

}
