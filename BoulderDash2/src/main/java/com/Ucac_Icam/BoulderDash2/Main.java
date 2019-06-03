/**
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
package com.Ucac_Icam.BoulderDash2;

import controller.Controller;
import model.Model;
import view.View;


/*import contract.ControllerOrder;
import controller.Controller;
import model.Model;
import view.View;
*/
/**
 * The Class Main.
 *
 * @author Group 4
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	 final Controller controller = new Controller (new View(), new Model());
    	
    	 /**
    	  * start program
    	  */
    	 controller.start();
    
    }
}
