package view;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * 
 * @author Group 4 
 *
 */
/**
 * 
 * class Panneau
 *
 */
public class Panneau extends JPanel{

	public Panneau() {
	}
	
	public void paintComponent (Graphics g) {
	
		try {
			Image img = ImageIO.read(new File("C:\\Users\\TADAH GILDAS\\Desktop\\projet java\\bdlogobig.jpg"));
			g.drawImage(img ,0, 0, this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
