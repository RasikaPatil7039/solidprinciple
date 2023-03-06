package com.aurionpro.model;

public class Loader implements IWorker {

	@Override
	public void start() {
		System.out.println("loader is starting");

	}

	@Override
	public void stop() {
		System.out.println("loader stop");

	}

	@Override
	public void eat() {
		System.out.println("loader eating");

	}

	@Override
	public void rest() {
		System.out.println("loader rest");

	}

}
