package Element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 
 * @author Group 4
 *
 */
public class Stars {
	/**
	 * Implementation of the different setter and getter corresponding to my hero
	 */
	
	/**
	 * we used this class to add a position and give the good picture corresponding of a hero
	 */
	 private static int[] x= new int[9];
	 private static int[] y= new int[9];

		private  Image img;

		public  Image getImg() {
			return img;
		}

		public void setImg(Image img) {
			this.img = img;
		}


		
		public static  int getY(int i) {
		return y[i];
		}
		
		public static void setY(int a, int i) {
		   y[i] = a;
		}

		public static int getX(int i) {
		return x[i];
		}
		
		public static void setX(int a, int i) {
		x[i] = a;
		}
		
		
	public Stars() {
		// TODO Auto-generated constructor stub
		try {
			this.img =  ImageIO.read(new File("C:\\Images\\star.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
