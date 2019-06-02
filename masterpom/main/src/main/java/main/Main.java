
package main;
import java.awt.HeadlessException;
import java.sql.SQLException;

import javax.swing.JFrame;
import contract.ControllerOrder;
import controller.Controller;
import model.Model;
import view.View;

/**
 * The Class Main.
 *
 * @author Groupe 4
 */
public abstract class Main {
	public static View view;

    public static void main(final String[] args) throws HeadlessException, SQLException{
    	
    
    	
      final Model model = new Model();
     View view = new View(model);
       final Controller controller = new Controller(view, model);
    //    view.setController(controller);

      controller.start();
      //  controller.orderPerform(ControllerOrder.English);
    }
}
