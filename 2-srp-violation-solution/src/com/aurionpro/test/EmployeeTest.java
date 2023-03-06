package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.PrintSalarySlip;
import com.aurionpro.model.Tax;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee obj=new Employee(1, "rasika", 50000);
		new Tax().calculatetax(obj);
		new PrintSalarySlip().printsalaryslip(obj);
		
	}

}
