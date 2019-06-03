package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Element.DiamondState;
import contract.IView;
import model.Model;



/**
 * The Class ViewFrame.
 *
 * @author Group 4
 */
public class ViewFrame extends JFrame implements ActionListener {

/** The panel. */
	private ViewPanel pan;
	private Panneau p;
	private int i = 0;
	
	
/** The constant HEIGHT. */	
private final static int HEIGHT=780;

/** The constant WIDTH. */
private final static int WIDTH=1080;
	
/**
	 * Instantiates a new view frame.
	 */
	public ViewFrame() {
		this.buildViewFrame();
	}


	/**
	 * Builds the view frame.
	 *
             we use the buildViewFrame method to generate 
             the window as well as everything that goes with it
	 *
	 * @param model
	 *          the model
	 */
	private void buildViewFrame() {
	    pan = new ViewPanel();
	    p = new Panneau();
	    this.addKeyListener(new KeyBoard(pan));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("BoulderDash");
		this.setResizable(false);
		this.setSize(WIDTH,HEIGHT);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setContentPane(pan);
	}


	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.i+=1;
	}
	



}