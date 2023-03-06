package com.aurionpro.test;

import com.aurionpro.model.FestivalType;
import com.aurionpro.model.FixedDeposit;

public class FDTest {

	public static void main(String[] args) {
		FixedDeposit obj=new FixedDeposit(1, "rasika", 1000, 6, FestivalType.Diwali);
		System.out.println(obj);
		System.out.println("simple interet is: "+obj.calculatesimpleinterest());
		

	}

}
