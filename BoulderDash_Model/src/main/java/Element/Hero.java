package Element;

import java.awt.Container;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import model.Model.*;

/** 
* @author Group 4
* 
*/

public class Hero {
//public static ImageIcon hero = new ImageIcon("C:\\\\Images\\\\persoface.png");

/**
 * Implementation of the different setter and getter corresponding to my hero
 */
 private static int x=186;
 private static int y=124;

	private Image img;

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}

	private Image img1;

	public Image getImg1() {
		return img1;
	}

	public void setImg1(Image img) {
		this.img1 = img;
	}
	
	private Image img2;

	public Image getImg2() {
		return img2;
	}

	public void setImg2(Image img) {
		this.img2 = img;
	}

	private Image img3;

	public Image getImg3() {
		return img3;
	}

	public void setImg3(Image img) {
		this.img3 = img;
	}

	private Image img4;

	public Image getImg4() {
		return img4;
	}

	public void setImg4(Image img) {
		this.img4 = img;
	}
	
	private Image img5;

	public Image getImg5() {
		return img5;
	}

	public void setImg5(Image img) {
		this.img5 = img;
	}

	
	public static  int getY() {
	return y;
	}
	
	public static void setY(int a) {
	   y = a;
	}

	public static int getX() {
	return x;
	}
	
	public static void setX(int a) {
	x = a;
	}
	
	public Hero() {
//		this.setImage ( new ImageIcon("C:\\\\Images\\\\persoface.png").getImage());
		try {
			this.img =  ImageIO.read(new File("C:\\\\\\\\Images\\\\\\\\persoface.png"));
			this.img1 = ImageIO.read(new File("C:\\Images\\creusegauche.png"));
			this.img2 = ImageIO.read(new File("C:\\\\Images\\\\creusedroite.png"));
			this.img3 = ImageIO.read(new File("C:\\\\Images\\\\persoface3.png"));
			this.img4 = ImageIO.read(new File("C:\\\\Images\\\\persoface2.png"));
			this.img5 = ImageIO.read(new File("C:\\\\Images\\\\persomort.png"));
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated constructor stub
	}
	
	
}
