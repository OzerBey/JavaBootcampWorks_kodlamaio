package abstractClasses;

public abstract class GameCalculator { // Base class

	// uncompleted operation
	public abstract void calculate();

	// completed operation
	public final void gameOver() {
		System.out.println("Game over !");
	}
}