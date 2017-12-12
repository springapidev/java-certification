package com.coderbd.ex21;

/**
 * @author Mohamamd Rajaul Islam
 */
public class Logger {
	private Logger() {
		// private constructor
	}
	public static class LoggerHolder {
		public static Logger logger = new Logger();
	}
	public static Logger getInstance() {
		return LoggerHolder.logger;
	}
	public void log(String s) {
		// log implementation
		System.err.println(s);
	}
}
