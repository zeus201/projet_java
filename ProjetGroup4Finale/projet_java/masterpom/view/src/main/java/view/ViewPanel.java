package view;

import java.awt.Graphics;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import model.hero;
import model.*;
import contract.IModel;


/**
 * The Class ViewPanel.
 *
 */
class ViewPanel extends JPanel implements Observer {

	private static final int x = 0;
	/** The view frame. */
	private ViewFrame	viewFrame;
	DAOLevel l = new DAOLevel();
	private IModel model;
	private int y;
	private int hauteur;
	private int largeur;
	hero h= new hero( x, y,  hauteur,  largeur);
	/** The Constant serialVersionUID. */
	private static final long	serialVersionUID	= -998294702363713521L;
 
    coordonnees[][]objects = new coordonnees[25][37];
	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	}
	public ViewPanel() {
		remplissage();
	}
	

	/**
	 * Gets the view frame.
	 *
	 * @return the view frame
	 */
	private ViewFrame getViewFrame() {
		return this.viewFrame;
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	public void update(final Observable arg0, final Object arg1) {
		this.repaint();
	}
	public void remplissage() {
		int j=0;
		for(int i=0;i<25;i++) {
			for(j=0; j<37; j++) {
				if(l.getScenetest()[i][j]=='G') {
					objects[i][j]= new Background(i*32, j*32, i, j);	
				}
				else if (l.getScenetest()[i][j]==' ') {
					objects[i][j]= new voidd(i*32, j*32, i, j);
				}
				else if (l.getScenetest()[i][j]=='W') {
					objects[i][j]= new blueg(i*32, j*32, i, j);
				}
				else if (l.getScenetest()[i][j]=='0') {
					objects[i][j]= new rock(i*32, j*32, i, j);
				}
				else if (l.getScenetest()[i][j]=='M') {
					objects[i][j]= new enemy(i*32, j*32, i, j);
				}
				else if (l.getScenetest()[i][j]=='*') {
					objects[i][j]= new diamond(i*32, j*32, i, j);
				}
				else {
					objects[i][j]= new Background(i*32, j*32, i, j);	
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
		for(int i=0; i<25; i++) {
			for(int j=0; j<37; j++) {
				if(objects[i][j] != null)
					graphics.drawImage(objects[i][j].getImg(),objects[i][j].getX(),objects[i][j].getY(),this);
			}
		}
		graphics.drawImage(h.getImg(), h.getX(),hauteur, this);
				repaint();
	}
	}
