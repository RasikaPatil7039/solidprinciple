package com.aurionpro.model;

public class TaxCalculator {

	private DBLogger dblogger;

	public TaxCalculator(DBLogger dblogger) {
		super();
		this.dblogger = dblogger;
	}
	
	public  int calculatetax(int amount,int rate) {
		int tax=0;
		try {
		 tax =amount /rate;
		 System.out.println(tax);
		
	}
		catch (Exception e) {
			new DBLogger().log("divided by zero");
		}
		return tax;
}
}