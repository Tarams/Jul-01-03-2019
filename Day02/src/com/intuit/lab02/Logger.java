package com.intuit.lab02;

import java.util.function.Supplier;

public class Logger {
	private int level = 1;

	public Logger() {
	}
	public Logger(int level) {
		this.level = level;
	}
	private boolean isDebugEnabled() {
		return level == 1;
	}
	/*public void debug(String message) {
		System.out.println(message);
	}*/
	
	public void debug(Supplier<String> supplier) {
		String message = supplier.get();
		if(isDebugEnabled()) {
			//log the message
			System.out.println("--------> " + message);
		}	
	}
}
