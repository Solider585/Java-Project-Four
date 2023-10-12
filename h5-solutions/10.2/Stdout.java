package q10_2;

import java.io.PrintStream;

/**
 * implements a singleton for stdout
 * @author icardei
 *
 */
public class Stdout {
	/**
	 * The only instance there can be. (class variable)
	 */
	static private Stdout theInstance = null;
	
	/**
	 * instance variable that does the job.
	 */
	private PrintStream stdoutStream = null;
	
	/**
	 * private constructor: don't allow anyone else to create instances
	 */
	private Stdout() {
		this.stdoutStream = System.out;
	}
	
	/**
	 * print a string
	 * @param s the string
	 */
	public void println(String s) {
		this.stdoutStream.println(s);
	}
	
	/**
	 * Lazily creates the instance and returns it.
	 * @return the only instance
	 */
	public static Stdout getInstance() {
		if (theInstance == null) {
			theInstance = new Stdout();
		}
		return theInstance;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// causes compiler error:
		// Stdout stdout = new Stdout();
		
		Stdout stdout = Stdout.getInstance();
		stdout.println("testing...testing...testing...");
	}

}
