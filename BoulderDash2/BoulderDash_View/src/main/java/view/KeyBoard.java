package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Element.Hero;
import Element.MobileElement;
import model.*;
import contract.IView;

/**
 * 
 * @author Group 4 
 *
 */
/**
 * 
 * class keyBoarad
 *
 */
public class KeyBoard  implements KeyListener{
	
	//Personnage p;
	
	ViewPanel p; 
	public static Hero hero;
	
	/**
	 *  create a constructor keyBoard
	 * 
	 */
	

/**
 * instantiate a hero object
 * @param p
 */
	public KeyBoard(ViewPanel p) {

	    this.p = p;
	    this.hero = new Hero();
	}

	/**
	 * displacement
	 */
	public void keyPressed(KeyEvent k) {
		if (k.getKeyCode()== KeyEvent.VK_UP) {
			
			
			MobileElement.boardh();
			p.moveUp();
			MobileElement.moves();
	
			
			
			
		}
		if (k.getKeyCode()== KeyEvent.VK_DOWN) {
			
			MobileElement.boardb();
		//	MobileElement.boardbr();
			p.moveDown();
			MobileElement.moves();
		//	p.reput();
		//	hero.dig();
			
		}
		if (k.getKeyCode()== KeyEvent.VK_LEFT) {
			MobileElement.boardg();
			MobileElement.boardgr();
			p.moveLeft();
			MobileElement.moves();
		//	p.reput();
		//	hero.dig();
			
			
		}
		if (k.getKeyCode()== KeyEvent.VK_RIGHT) {
	
			MobileElement.boardd();
			MobileElement.boarddr();
			//p.reput();
			p.moveRight();
			MobileElement.moves();
		//	hero.dig();
			
		  
		}
	}

	public void keyReleased(KeyEvent k) {
		// TODO Auto-generated method stub
		
		
	}

	public void keyTyped(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}

}
