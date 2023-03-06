package com.aurionpro.model;

public class Robot implements IWorker {

	@Override
	public void start() {
		System.out.println("robot is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("robot stop");
		
	}

	@Override
	public void eat() {
		System.out.println("robot eating");
		
	}

	@Override
	public void rest() {
		System.out.println("robot rest");
		
	}

}
