package model;

import javax.swing.ImageIcon;

public class rock extends coordonnees {

	public rock(int x, int y, int hauteur, int largeur) {
		super(x, y, hauteur, largeur);
		// TODO Auto-generated constructor stub
		this.setImg(new ImageIcon("C:\\Images\\roche.png").getImage());
	}

}
