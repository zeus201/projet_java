package view;

import contract.IView;

/**
 * The Class View.
 *
 * @author Group 4
 */
public final class View implements IView{

	/** The frame. */
	private ViewFrame viewFrame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View() {
		this.viewFrame = new ViewFrame();
	}

	public ViewFrame getViewFrame() {
		return viewFrame;
	}

	public void setViewFrame(ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}



}