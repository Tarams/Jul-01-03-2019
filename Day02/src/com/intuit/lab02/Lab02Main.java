package com.intuit.lab02;

public class Lab02Main {

	public static void main(String[] args) {
		/*
		Logger logger = new Logger();
		if (logger.isDebugEnabled()) {
			logger.debug("Look at this horrible error");
		}
		*/
		Logger logger = new Logger();	
		logger.debug(() -> {
			//send email
			System.out.println("*****Sending email");
			return "Look at this horrible error";
		});
		
		logger.debug(() -> {
			//store it in DB
			System.out.println("*****Store in DB");
			return "hmm interesting error";
		});
		
		logger.debug(() -> "Incorrect input");
	}

}
