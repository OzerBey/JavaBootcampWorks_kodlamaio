package inheritanceV2;

public class EmailLogger extends Logger { // is-a relations

	@Override
	public void log() {
		System.out.println("email sent");
	}
}
