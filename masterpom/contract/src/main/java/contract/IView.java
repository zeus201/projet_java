package contract;

/**
 * The Interface IView.
 *
 * @author Jean-Aymeric Diet
 */
public interface IView {

	public void displayRockford();
	public void displayGround();
	public void displayMenu();
	public void displayStone();
	public void displayWall();
	public void displayDiamond();
	void printMessage(final String message);
}
