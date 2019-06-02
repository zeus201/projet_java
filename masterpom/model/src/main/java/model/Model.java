package model;

import java.sql.SQLException;
import java.util.Observable;

import contract.IModel;
import entity.HelloWorld;

/**
 * The Class Model.
 *
 * @author Jean-Aymeric Diet
 */
public final class Model extends Observable implements IModel {

	/** The helloWorld. */
	private HelloWorld helloWorld;
    public static coordonnees[][]objects=new coordonnees[16][13];
    private static boolean a=true;
    private static boolean b=true;
    private static boolean c=true;
    private static boolean d=true;
    private static boolean e=true;
    private static boolean f=true;
    private static boolean g=true;
    private static boolean h=true;
    
    public static boolean isA() {
    	return a;
    }
    public static void setA(boolean i) {
    	a=i;
    }
    public static boolean isB() {
    	return b;
    }
    public static void setB(boolean i) {
    	b=i;
    }
    public static boolean isC() {
    	return c;
    }
    public static void setC(boolean i) {
    	c=i;
    }
    public static boolean isD() {
    	return d;
    }
    public static void setD(boolean i) {
    	d=i;
    }
    public static boolean isE() {
    	return e;
    }
    public static void setE(boolean i) {
    	e=i;
    }
    public static boolean isF() {
    	return f;
    }
    public static void setF(boolean i) {
    	f=i;
    }
    public static boolean isG() {
    	return g;
    }
    public static void setG(boolean i) {
    	g=i;
    }
    public static boolean isH() {
    	return h;
    }
    public static void setH(boolean i) {
    	h=i;
    }
    
    
	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.helloWorld = new HelloWorld();
	}

	/**
     * Gets the hello world.
     *
     * @return the hello world
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage()
	 */
	public HelloWorld getHelloWorld() {
		return this.helloWorld;
	}

	/**
     * Sets the hello world.
     *
     * @param helloWorld
     *            the new hello world
     */
	private void setHelloWorld(final HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
		this.setChanged();
		this.notifyObservers();
	}

	/**
     * Load hello world.
     *
     * @param code
     *            the code
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */
	public void loadHelloWorld(final String code) {
		try {
			final DAOHelloWorld daoHelloWorld = new DAOHelloWorld(DBConnection.getInstance().getConnection());
			this.setHelloWorld(daoHelloWorld.find(code));
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/**
     * Gets the observable.
     *
     * @return the observable
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}
}
