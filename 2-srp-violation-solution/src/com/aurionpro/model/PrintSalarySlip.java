package com.aurionpro.model;

public class PrintSalarySlip {
	public void printsalaryslip(Employee emp) {
		System.out.println("id : " + emp.getId());
		System.out.println("name : " + emp.getName());
		System.out.println("salary : " + emp.getSalary());
		System.out.println("tax : " + new Tax().calculatetax(emp));

	}
}
