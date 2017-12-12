package com.coderbd.ex20;

/**
 * @author Mohamamd Rajaul Islam
 */
public class Logger {
	private Logger() {
		// private constructor to prevent direct instantiation 
	}
	private static Logger myInstance;
	public static synchronized Logger getInstance() {
		if(myInstance == null)
			myInstance = new Logger();
		return myInstance;
	}
	public void log(String s){
		// log implementation
		System.err.println(s);
	}
}
