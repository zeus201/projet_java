package Element;


import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * 
 * @author Group 4
 *
 */

/**
 * 
 * @author we used this class to shine the diamonds
 *
 */
public enum DiamondState {
	
	diam1 (new ImageIcon("C:\\Images\\diam1.png").getImage()),
	diam2 (new ImageIcon("C:\\Images\\diam2.png").getImage()),
	diam3 (new ImageIcon("C:\\Images\\diam3.png").getImage()),
    diam4 (new ImageIcon("C:\\Images\\diam4.png").getImage());
	
	private Image image=null;
	
   DiamondState(Image image){  
		this.image=image; 
		}
	
	public Image getImage() {
		return image;
	}
	public void setImage(Image image) {
		this.image = image;
	}   
	
    


}
