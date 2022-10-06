package week3_homework.example2.CreditExample;

public abstract class BaseCreditManager implements ICreditService {

	// Abstract methods holds on uncompleted and common process
	@Override
	public abstract void calculate(); // This method is abstract because different event each other.

	@Override
	public void save() {
		System.out.println("Credit saved on BaseCreditManager..");
	}

}
