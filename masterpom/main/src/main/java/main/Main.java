
package main;
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

    public static void main(final String[] args) {
    	
    	JFrame frame = new JFrame("Application");
    	 frame.setSize(600, 600);
    	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    	 frame.setLocationRelativeTo(null);
    	 frame.setVisible(true); 
    	
   //   final Model model = new Model();
    //    final View view = new View(model);
    //    final Controller controller = new Controller(view, model);
    //    view.setController(controller);

     //   controller.control();
      //  controller.orderPerform(ControllerOrder.English);
    }
}
