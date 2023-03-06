package com.aurionpro.model;

public class Robot implements IWorkable {

	@Override
	public void start() {
		System.out.println("robot is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("robot is stop");
		
	}

	

}
