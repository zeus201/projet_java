package model;

import javax.swing.ImageIcon;

public class Background extends coordonnees{

	public Background(int x, int y, int hauteur, int largeur) {
		super(x, y, hauteur, largeur);
		// TODO Auto-generated constructor stub
		this.setImg(new ImageIcon("C:\\Images\\terre.png").getImage());
	}

}
