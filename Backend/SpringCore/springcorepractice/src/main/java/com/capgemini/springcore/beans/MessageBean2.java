package com.capgemini.springcore.beans;

public class MessageBean2 {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init() {
		System.out.println("INIT PHASE...");
	}
	
	public void destroy() {
		System.out.println("DESTROY PHASE...");
	}
}
