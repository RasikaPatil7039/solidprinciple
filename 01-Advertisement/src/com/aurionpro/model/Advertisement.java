package com.aurionpro.model;

public class Advertisement {

	private String message;
	private IDisplayable display;

	public Advertisement(String message, IDisplayable display) {
		super();
		this.message = message;
		this.display = display;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public IDisplayable getDisplay() {
		return display;
	}

	public void setDisplay(IDisplayable display) {
		this.display = display;
	}

	public void showAdvertisement() {
		display.display(message);
	}
}
