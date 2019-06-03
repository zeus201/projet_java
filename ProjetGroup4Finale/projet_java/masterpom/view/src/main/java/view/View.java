package view;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.SQLException;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View. 
 *
 * @author Jean-Aymeric Diet
 */
public final class View implements IView, Runnable {

	/** The frame. */
	private ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) throws HeadlessException, SQLException {
		this.viewFrame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}
	public void setViewFrame(ViewFrame viewFrame) {
		this.viewFrame=viewFrame;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.viewFrame.setVisible(true);
	}

	@Override
	public void displayRockford() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayStone() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayWall() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayDiamond() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printMessage(String message) {
		// TODO Auto-generated method stub
		
	}
	public static ControllerOrder keyCodeToControllerOrder(int keyCode) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	
}
