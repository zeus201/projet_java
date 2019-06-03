package model;

import javax.swing.ImageIcon;

public class enemy extends coordonnees{

	public enemy(int x, int y, int hauteur, int largeur) {
		super(x, y, hauteur, largeur);
		// TODO Auto-generated constructor stub
		this.setImg(new ImageIcon("C:\\Images\\monstre.png").getImage());
	}
}